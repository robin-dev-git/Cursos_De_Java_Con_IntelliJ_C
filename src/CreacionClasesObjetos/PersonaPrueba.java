package CreacionClasesObjetos;

public class PersonaPrueba
{
    public static void main(String[] args)
    {
        // Creación de un objeto
        Persona persona1 = new Persona();

        // Llamando a un método del objeto creado
        System.out.println("Valores por default del objeto Persona:");
        persona1.desplegarNombre();

        // Modificar valores del objeto creado
        persona1.nombre = "Robinson";
        persona1.apellidoPaterno = "Espejo";
        persona1.apellidoMaterno = "Londoño";

        // Volvemos a llamar al método
        System.out.println("\nNuevos valores del objeto Persona:");
        persona1.desplegarNombre();

        // Creación de un segundo objeto
        Persona persona2 = new Persona();
        System.out.println("\nCreación nuevo objeto");
        persona2.nombre = "Carlos";
        persona2.desplegarNombre();
    }
}
