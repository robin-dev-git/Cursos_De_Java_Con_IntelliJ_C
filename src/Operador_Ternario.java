public class Operador_Ternario
{
    public static void main(String[] args)
    {

        int numero = 10;

        var resultado = (numero % 2 == 0) ? "Es número par" : "Es número impar";
        System.out.println("resultado = " + resultado);

        var par = (numero % 2 == 0) ? true : false;
        if (par)
        {
            System.out.println("Es número par");
        } else
        {
            System.out.println("Es número impar");
        }
    }
}
