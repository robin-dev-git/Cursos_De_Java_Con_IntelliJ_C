package PasoPorValor;

public class PasoPorValor
{
    public static void main(String[] args)
    {
        var x = 10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);
    }

    public static void imprimir(int arg)
    {
        System.out.println("arg = " + arg);
    }

    public static void cambiarValor(int i)
    {
        i = 100;
    }
}
