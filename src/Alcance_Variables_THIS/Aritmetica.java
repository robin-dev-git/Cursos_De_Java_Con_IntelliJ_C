package Alcance_Variables_THIS;

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
    Aritmetica(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    // Este método sumar toma los atributos de la clase
    int sumar()
    {
        return (a + b);
    }

    // Método restar
    int restar()
    {
        return (a - b);
    }

    // Método multiplicar
    int multiplicar()
    {
        return (a * b);
    }

    // Método dividir
    int dividir()
    {
        return (a / b);
    }
}
