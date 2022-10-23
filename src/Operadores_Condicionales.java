public class Operadores_Condicionales
{
    public static void main(String[] args)
    {
        int a = 4;
        int valorMinimo = 0, valorMaximo = 10;
        //boolean res = a >= valorMinimo && a <= valorMaximo;
        //System.out.println("res = " + res);
        if (a >= valorMinimo && a <= valorMaximo)
        {
            System.out.println("Dentro de rango");
        } else
        {
            System.out.println("Fuera de rando");
        }

        boolean vacaciones = true;
        boolean diaDescansar = false;

        if (vacaciones || diaDescansar)
        {
            System.out.println("Padre puede asistir al juego del hijo");
        } else
        {
            System.out.println("Padre ocupado");
        }
    }
}
