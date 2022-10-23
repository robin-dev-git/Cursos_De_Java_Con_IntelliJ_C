public class Ciclo_While__Do_While
{
    public static void main(String[] args)
    {
        var i = 0;
        var j = 0;
        while (i < 3)
        {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println();
        do
        {
            System.out.println("j = " + j);
            j++;
        } while (j <= 8);
    }
}
