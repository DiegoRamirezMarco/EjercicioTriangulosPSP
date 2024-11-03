package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Triangulo
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("Se requiere un argumento");
            return;
        }
        int filas = Integer.parseInt(args[0]);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("mm:ss:SSS");
        String tiempo = LocalDateTime.now().format(formato);
        System.out.println("Comienzo: "+ tiempo);
        for (int i=filas; i>=1; i--)
        {

            for (int n=1; n<=i; n++)
            {

                System.out.print(n);
            }
            System.out.println();

        }
        System.out.println("Final: " +tiempo);
    }
}