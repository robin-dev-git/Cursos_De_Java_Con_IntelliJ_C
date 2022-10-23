public class TiposPrimitivosTiposFlotantes {
    public static void main(String[] args) {
        // float, double
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor máximo  tipo float: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("valor máximo  tipo double: " + Double.MAX_VALUE);
        System.out.println();

        float floatVar = 1.05F;
        double doubleVar = 1.0D;

        var floatVar2 = 10.0F;
        var doubleVar2 = 10.14;
    }
}
