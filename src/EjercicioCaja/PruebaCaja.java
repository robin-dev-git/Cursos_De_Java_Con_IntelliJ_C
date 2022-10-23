package EjercicioCaja;

public class PruebaCaja
{
    public static void main(String[] args)
    {
        // Variables locales
        int objetAncho = 3;
        int objetoAlto = 2;
        int objetoProfundo = 6;

        // Creamos un objeto de la clase y argumentos de variables
        Caja objeto1 = new Caja(objetAncho, objetoAlto, objetoProfundo);

        // Imprimimos el cálculo de caja.
        System.out.println("\nResultado Caja: " + objeto1.calcularCaja());

        // Creamos un objeto de la clase y argumentos sin variables
        // Caja objeto2 = new Caja(2, 4, 8);

        // Imprimimos el cálculo de caja com Volumen.
        // System.out.println("\nResultado Caja de Volumen: " + objeto2.calcularCajaVolumen());
    }


}
