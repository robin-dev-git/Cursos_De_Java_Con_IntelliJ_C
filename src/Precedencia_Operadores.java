public class Precedencia_Operadores
{
    public static void main(String[] args)
    {
        var x = 5;
        var y = 10;
        var z = ++x + y--; // x = 6; y = 10.

        System.out.println("x = " + x); // x = 6
        System.out.println("y = " + y); // y = 9
        System.out.println("z = " + z); // z = 16

        System.out.println("Ejemplo precedencia de Operadores");
        var resultado = 4 + 5 * 6 / 3; // 4+(5*6)/3 => 4+30/3 => 4+10 => 14
        System.out.println("resultado = " + resultado);

        resultado = (4+5) * (6/3); // => 9 * 2 => 18
        System.out.println("resultado2 = " + resultado);
    }
}
