package ProyectoAritmeticaConstructor;

public class PruebaAritmetica
{
    public static void main(String[] args)
    {
        // Creamos un objeto de la clase Aritmetica
        Aritmetica objeto1 = new Aritmetica();
        objeto1.a = 5;
        objeto1.b = 3;
        int resultado = objeto1.sumar();
        System.out.println("resultado = " + resultado);

        // Creamos un segundo objeto del tipo Aritmetica
        Aritmetica objeto2 = new Aritmetica(2, 4);
        System.out.println("Resultado 2: " + objeto2.sumar());
    }
}
