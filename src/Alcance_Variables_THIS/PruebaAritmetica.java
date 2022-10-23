package Alcance_Variables_THIS;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        // Variables locales
        int operadorA = 6;
        int operadorB = 2;

        // Creamos un objeto de la clase enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operadorA, operadorB);

        // Imprimimos los valores de los operados
        System.out.println("operadorA = " + operadorA);
        System.out.println("operadorB = " + operadorB);

        // Imprimimos el resultado suma
        System.out.println("\nResultado suma: " + objeto1.sumar());

        // Imprimimos el resultado resta
        System.out.println("\nResultado resta: " + objeto1.restar());

        // Imprimimos el resultado multiplicar
        System.out.println("\nResultado multiplicar: " + objeto1.multiplicar());

        // Imprimimos el resultado dividir
        System.out.println("\nResultado dividir: " + objeto1.dividir());
    }
}
