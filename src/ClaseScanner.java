import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona tu nombre:");
        var usuario = scanner.nextLine();
        var saludar = "Saludo";
        System.out.println(saludar + " " + usuario);
    }
}
