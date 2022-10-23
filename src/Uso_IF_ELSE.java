public class Uso_IF_ELSE
{
    public static void main(String[] args)
    {
        var numero = 1;
        var texto = "Número desconocido";

        if (numero == 1)
        {
            texto = "Número uno";
        }
        else if (numero == 2)
        {
            texto = "Número dos";
        }
        else if (numero == 3)
        {
            texto = "Número tres";
        }
        else
        {
            texto = "Número desconocido";
        }

        System.out.println("texto = " + texto);
    }
}
