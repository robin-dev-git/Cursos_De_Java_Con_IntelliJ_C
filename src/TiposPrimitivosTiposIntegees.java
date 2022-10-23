public class TiposPrimitivosTiposIntegees {
    public static void main(String[] args) {
        //byte, short, int, long
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo  tipo byte: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo shotr: " + Short.SIZE);
        System.out.println("bytes tipo shotr: " + Short.BYTES);
        System.out.println("valor minimo tipo shotr: " + Short.MIN_VALUE);
        System.out.println("valor máximo  tipo shotr: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor máximo  tipo int: " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor máximo  tipo long: " + Long.MAX_VALUE);
        System.out.println();

        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        short shortVart = 100;
        System.out.println("shortVart = " + shortVart);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10; // o se puede convertirse tipo de int a long: var numero = 10L; miniscula o mayuscula
        System.out.println("numero = " + numero);

    }
}
