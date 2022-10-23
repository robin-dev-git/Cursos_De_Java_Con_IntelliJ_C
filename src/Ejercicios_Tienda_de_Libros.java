import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios_Tienda_de_Libros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Escribe tu solucion aqui
        String nombre = "Programacion con Java";
        System.out.print("Ingrese el número de id al libro: ");
        int id = Integer.parseInt(scanner.nextLine());
        double precio = 890.00;
        double precio2 = 690.00;
        char simbolo = '\u0024';
        boolean envioGratuito = false;
        String precioText = String.valueOf(precio);
        String precioText2 = String.valueOf(precio2);

        if (id == 1520) {
            envioGratuito = true;
            System.out.println(nombre + " #" + id);
            System.out.println("Precio: " + simbolo + precioText);
            System.out.println("Envio gratuito: " + envioGratuito);
        } else if (id == 1521) {
            nombre = "Programacion con Python";
            System.out.println(nombre + " #" + id);
            System.out.println("Precio: " + simbolo + precioText2);
            System.out.println("Envio gratuito: " + envioGratuito);
        } else {
            System.out.println("Lo siento, no se encuentre el libro.");
        }

        // Solución:
        /*
        String nombre = scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());
        double precio = Double.parseDouble(scanner.nextLine());
        char simbolo = scanner.nextLine().charAt(0);
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
         */
    }
}
