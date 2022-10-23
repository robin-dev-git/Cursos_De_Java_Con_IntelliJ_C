import java.util.Scanner;

public class Calculo_Estacion_Ango_IF_ELSE
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número de mes: ");
        int mes = Integer.parseInt(scanner.nextLine()); // Mes del Año
        String estacion;

        if (mes == 1 || mes == 2 || mes == 12)
        {
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5)
        {
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8)
        {
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11)
        {
            estacion = "Otoño";
        }
        else {
            estacion = "Mes incorrecto";
        }

        System.out.println("estacion = " + estacion);
    }
}
