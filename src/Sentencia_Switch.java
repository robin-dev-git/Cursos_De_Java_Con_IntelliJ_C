import java.util.Scanner;

public class Sentencia_Switch
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de opcion: ");
        var opcion = Integer.parseInt(scanner.nextLine());
        var texto = "número desconocido";

        switch (opcion)
        {
            case 1:
                texto = "Número uno";
                break;
            case 2:
                texto = "Número dos";
                break;
            case 3:
                texto = "Número tres";
                break;
            default:
                texto = "Número desconocido";
                break;
        }
        System.out.println("La respuesta de opción: " + texto);
    }
}
