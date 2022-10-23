import java.util.Scanner;

public class Ejercicio_IF_ELSE_Sistema_Calificaciones
{
    public static void main(String[] args)
    {
        /*
        El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
        El usuario proporcionará un valor entre 0 y 10.

        Si está entre 9 y 10: imprimir una A
        Si está entre 8 y menor a 9: imprimir una B
        Si está entre 7 y menor a 8: imprimir una C
        Si está entre 6 y menor a 7: imprimir una D
        Si está entre 0 y menor a 6: imprimir una F

        cualquier otro valor debe imprimir: Valor desconocido
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor de calificado entre 0 y 10: ");
        var valor = Integer.parseInt(scanner.nextLine());
        var texto = "Valor desconocido";
        if (valor >= 9 && valor <= 10)
        {
            texto = "Valor es A";
        }
        else if (valor >= 8 && valor < 9)
        {
            texto = "Valor es B";
        }
        else if (valor >= 7 && valor < 8)
        {
            texto = "Valor es C";
        }
        else if (valor >= 6 && valor < 7)
        {
            texto = "Valor es D";
        }
        else if (valor >= 0 && valor < 6)
        {
            texto = "Valor es F";
        }
        else
        {
            texto = "Valor desconocido";
        }
        System.out.println("texto = " + texto);

        // Solución
        /*
        int calificacion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");
         */

    }
}
