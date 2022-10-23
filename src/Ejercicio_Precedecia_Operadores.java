public class Ejercicio_Precedecia_Operadores
{
    public static void main(String[] args)
    {
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        // res 1: 6 / ++a => 6 / 3
        System.out.println(6 / 3); // es 2
        // res 2: 2 * 4
        System.out.println(2 * 4); // es 8
        // res 3: -3 + 8 - 3 + 2;
        System.out.println(-3 + 8); // es 5
        // res 4: 5 - 3 + 2
        System.out.println(5 - 3); // es 2
        // res 5: 2 + 2
        System.out.println(2 + 2); // es 4

        // Solución
        /*
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        //Se evalua: 4 / ++a (donde 'a' se preincrementa y vale 3)
        System.out.println(6 / 3); //Imprime 2
        //Se evalua: 2 * 4
        System.out.println(2 * 4 ); //imprime 8
        //Se evalua -3 + 8
        System.out.println(-3 + 8); //imprime 5
        //Se evalua 5 - b-- (donde b primero se asigna 3, y luego se decrementa)
        System.out.println(5 - 3); //imprime 2
        //Se evalua 2 + b (teniamos pendiente un decremento de b, vale 2)
        System.out.println(2 + 2);//imprime 4,
        //System.out.println("res = " + res); //es el mismo valor que el valor final


        //Agrupando con parentesis tenemos:
        //Recordar que las expresiones se evaluan de izquierda a derecha
        //y se comienza a agrupar aplicando la precedencia de operadores
        //int res2 = ((-3 + ((6 / ++a) * 4)) - b--) + b;
        //System.out.println("res2 = " + res2);
         */

    }
}
