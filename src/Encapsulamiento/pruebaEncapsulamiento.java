package Encapsulamiento;

public class pruebaEncapsulamiento
{
    public static void main(String[] args)
    {
        Persona persona1 = new Persona("Juan", "Esperanza", true);

        System.out.println(persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println(persona1.getNombre());

        System.out.println(persona1);

        persona1.setBorrado(false);

        System.out.println(persona1);
    }
}
