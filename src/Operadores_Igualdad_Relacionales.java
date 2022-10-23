public class Operadores_Igualdad_Relacionales
{
    public static void main(String[] args)
    {
        int a = 3, b = 2;
        boolean c = (a == b);
        System.out.println("c = " + c);
        c = (a != b);
        System.out.println("c2 = " + c);

        String d = "hola", e = "adios";
        boolean f = d.equals(e);
        System.out.println("f = " + f);

        boolean g = (a > b);
        System.out.println("g = " + g);
        g = (a < b);
        System.out.println("g2 = " + g);
        g = (a <= b);
        System.out.println("g3 = " + g);

        if (a % 2 == 0)
        {
            System.out.println("Número par");
        } else
        {
            System.out.println("Número impart");
        }

        if (b % 2 != 0)
        {
            System.out.println("Número impar");
        } else
        {
            System.out.println("Número par");
        }

        int edad = 24;
        int adulto = 18;
        if (edad >= adulto)
        {
            System.out.println("Es un adulto");
        } else
        {
            System.out.println("Es menor de edad");
        }
    }
}
