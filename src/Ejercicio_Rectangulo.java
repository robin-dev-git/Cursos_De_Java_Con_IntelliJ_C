import java.util.Scanner;

public class Ejercicio_Rectangulo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el número de ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Area: " + (alto * ancho));
        System.out.println("Perímetro: " + ((alto + ancho) * 2));

        // solución
        /*
        int alto = Integer.parseInt(scanner.nextLine());
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
         */
    }
}
