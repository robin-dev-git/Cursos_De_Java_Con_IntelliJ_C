public class Tipos_Primitivos_TIpo_Boolean {
    public static void main(String[] args) {
        // boolean
        // System.out.println("bits tipo boolean: " + Boolean.SIZE);
        // System.out.println("bytes tipo boolean: " + Boolean.BYTES);
        System.out.println("True tipo boolean: " + Boolean.TRUE);
        System.out.println("False tipo boolean: " + Boolean.FALSE);
        System.out.println();

        boolean booleanVar = false;

        if (booleanVar) {
            System.out.println("La variable contiene un valor verdadero");
        } else {
            System.out.println("La variable contiene un valor falso");
        }

        System.out.println();
        var edad = 23;
        var adulto = edad >= 18;
        if (adulto) {
            System.out.println("Eres mayor de edad, puedes pasar");
        } else {
            System.out.println("Eres menor de edad, no puedes pasar");
        }
    }
}
