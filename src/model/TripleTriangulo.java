package model;

import java.io.File;
import java.io.IOException;

public class TripleTriangulo {
    public static void main(String[] args) {
        int[] tamaños = {5,7,9};
        File error = new File("src/recursos/errores.txt");
        for(int tamaño : tamaños){
            String classpath = System.getProperty("java.class.path");
            ProcessBuilder pb = new ProcessBuilder("java","-cp",classpath, "model.Triangulo", String.valueOf(tamaño));
            String ruta = "src/recursos/triangulo"+tamaño+".txt";
            File f = new File(ruta);
            pb.redirectOutput(f);

            pb.redirectError(error);
            try{
                Process proceso = pb.start();
                proceso.waitFor();
            } catch (IOException e) {
                System.out.println("Error1: " +e.getMessage());
            } catch (InterruptedException e) {
                System.out.println("Error2: " + e.getMessage());
            }
        }
    }
}
