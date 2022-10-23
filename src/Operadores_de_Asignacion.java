public class Operadores_de_Asignacion
{
    public static void main(String[] args)
    {
        int a = 3, b = 2;
        int c = a;

        a += 1; // a = a + 1
        System.out.println("a = " + a);

        a += 3; // a = a + 3
        System.out.println("a = " + a);

        b -= 1; // b = b -1
        System.out.println("b = " + b);

        a *= 2;
        System.out.println("a = " + a);

        a /= 4;
        System.out.println("a = " + a);

        c %= 1;
        System.out.println("c = " + c);
    }
}
