package ContextoEstatico;

public class EjemploEstatico
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona("Juan");
        System.out.println(persona1);

        Persona persona2 = new Persona("Karla");
        System.out.println(persona2);

        System.out.println("Persona.getContadorPersona() = " + Persona.getContadorPersona());
    }
}

class Persona
{
    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    public Persona(String nombre)
    {
        this.idPersona = contadorPersona++;
        this.nombre = nombre;
    }

    public int getIdPersona()
    {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona)
    {
        this.idPersona = idPersona;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public static int getContadorPersona()
    {
        return contadorPersona;
    }

    public String toString()
    {
        return "idPersona: " + idPersona + ", nombre: " + nombre;
    }
}