public class Tipos_Primitivos_TIpo_Char {
    public static void main(String[] args) {

        // char
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("valor minimo tipo char: " + Character.MIN_VALUE);
        System.out.println("valor máximo  tipo char: " + Character.MAX_VALUE);
        System.out.println();

        // char c = '\u0021'; // Unicode
        // char c = 33; // Decimal
        // char c = '!'; // Caracterer con Comillas
         var c = '\u0021'; // Unicode
        // var c = 33; // tipo de Entero, no debes usar en decimal de caracterer
        // var c = '!'; // el Java Automantico de variable con VAR
        System.out.println("c = " + c);
    }
}
