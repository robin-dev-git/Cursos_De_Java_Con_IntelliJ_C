package ProyectoAritmeticaConstructor;

public class Aritmetica
{
    // Atributos de la clase
    int a;
    int b;

    // Constructor vacío
    Aritmetica()
    {

    }

    // Constructor con 2 argumentos
    Aritmetica(int arg1, int arg2)
    {
        a = arg1;
        b = arg2;
    }

    // Este método sumar toma los atributos de la clase
    int sumar()
    {
        return (a + b);
    }
}
