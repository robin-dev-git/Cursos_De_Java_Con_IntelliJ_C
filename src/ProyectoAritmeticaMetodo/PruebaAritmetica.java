package ProyectoAritmeticaMetodo;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        // Creamos un objeto de la clase Aritmetica
        Aritmetica aritmetica = new Aritmetica();

        // Llamamos al método sumar y recibimos el valor devuelto.
        int resultado = aritmetica.sumar(5, 3);

        System.out.println("resultado = " + resultado);
    }
}
