public class Palabras_Break_Continue
{
    public static void main(String[] args)
    {
        for (var i = 0; i < 3; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("i = " + i);
                break; // Una ejecución vez sin varias veces
            }
        }
        System.out.println("\n");
        for (int j = 0; j < 3; j++)
        {
            if (j % 2 != 0)
            {
                continue; // Número impares no debe ejecutar en comando
            }
            System.out.println("j = " + j);
        }
    }
}
