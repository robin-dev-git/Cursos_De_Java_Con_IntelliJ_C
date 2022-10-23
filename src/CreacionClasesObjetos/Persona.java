package CreacionClasesObjetos;

public class Persona
{
    // Atributos de una clase
    // No es necesario asignar valores
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    // Método de la clase
    // Los usarán los objetos de esta clase
    public void desplegarNombre()
    {
        System.out.println("nombre = " + nombre);
        System.out.println("apellidoPaterno = " + apellidoPaterno);
        System.out.println("apellidoMaterno = " + apellidoMaterno);
    }

}
