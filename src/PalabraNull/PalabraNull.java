package PalabraNull;

public class PalabraNull
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());

        Persona persona2 = persona1;
        System.out.println("persona2 = " + persona2.obtenerNombre());

        // Hacemos persona1 ya no apunte al objeto persona.
        persona1 = null; // Es candidata para la elimine al recolector basura
        // System.out.println("persona1 = " + persona1.obtenerNombre());
        System.gc(); // garbage collector solo planifica la llamada
        persona2 = null;

        if (persona1 != null)
        {
            System.out.println("persona1 = " + persona1.obtenerNombre());
        }
    }
}

class Persona
{
    String nombre;

    Persona(String nombre)
    {
        this.nombre = nombre;
    }

    public String obtenerNombre()
    {
        return this.nombre;
    }
}