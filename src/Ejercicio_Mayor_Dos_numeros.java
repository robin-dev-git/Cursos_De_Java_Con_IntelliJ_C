import java.net.Inet4Address;
import java.util.Scanner;

public class Ejercicio_Mayor_Dos_numeros
{
    public static void main(String[] args)
    {
        /*
        Solicitar al usuario dos valores:
            numero1 (int)
            numero2 (int)
        Se debe imprimir el mayor de los dos números (sólo imprimir el número, sin ningún otro texto ni saltos de línea)
         */
        Scanner scanner = new Scanner(System.in);
        // Escribe aqui tu solución
        System.out.print("Escribe un número de primer: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Escribe un número de segundo: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        var mayor = (numero1 >= numero2) ? "Es número mayor de primer" : "Es número mayor de segundo";
        System.out.println("mayor = " + mayor);


        // Solución
        /*
        int numero1 = Integer.parseInt(scanner.nextLine());
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.println(numero1 > numero2 ? numero1 : numero2);
         */

    }
}
