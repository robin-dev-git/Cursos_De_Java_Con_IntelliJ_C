package PalabraReturnClases;

public class PalabraReturnClases
{
    public static void main(String[] args)
    {
        Suma s = creaObjetoSumar();
        int resultado = s.a + s.b;
        System.out.println("resultado = " + resultado);

    }

    public static Suma creaObjetoSumar()
    {
        Suma s = new Suma(2, 4);
        return s;
    }
}

class Suma {
    int a;
    int b;

    Suma(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}
