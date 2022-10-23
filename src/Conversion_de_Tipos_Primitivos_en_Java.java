import java.util.Scanner;

public class Conversion_de_Tipos_Primitivos_en_Java {
    public static void main(String[] args)
    {
        // int edad = Integer.parseInt("20");
        var edad = Integer.parseInt("20"); // Convertir tipo de entero
        System.out.println("edad = " + edad);

        // double valorPi = Double.parseDouble("3.14");
        var valorPi = Double.parseDouble("3.14"); // convertir el tipo de double
        System.out.println("valorPi = " + valorPi);

        char c = "hola".charAt(0); // indice los textos de cantidad en numero 0 es h
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);
        var edad2 = Integer.parseInt(scanner.nextLine()); //Convertir tipo de entero de entrada de variable
        System.out.println("edad = " + edad2);

        char caracter = scanner.nextLine().charAt(0); // Indicoe los textos de cantidad en la entrada de variable
        System.out.println("caracter = " + caracter);

        String ValorEdad = String.valueOf(edad); // Convertir en tipo de entero a tipo de caracteres
        System.out.println("ValorEdad = " + ValorEdad);

        String valorPiTexto = String.valueOf(valorPi); // converitr en tipo float/double a tipo de cadena/caracteres en la variable
        System.out.println("valorPiTexto = " + valorPiTexto);

        byte b = 10;
        short s = b; // Convertir en byte a short.

        short s1 = 15;
        byte b1 = (byte) (s1 + 1); // No es fácil que converitr en short a byte lo que anterior bits. Debe añadir con (byte)
    }
}
