package EjercicioCaja;

public class Caja
{
    // Variables de atributos de la clase
    private int ancho, alto, profundo;

    // Constructor Vacío
    Caja() {

    }

    // Constructor tres argumentos
    public Caja(int ancho, int alto, int profundo)
    {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // El método en calculado el volumen de caja
    public int calcularCaja()
    {
        return (ancho * alto * profundo);
    }

    public int calcularCajaVolumen(int ancho, int alto, int profundo)
    {
        return (ancho * alto * profundo);
    }
}
