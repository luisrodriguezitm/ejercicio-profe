import java.util.Scanner;

public class Validacion {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un dato numerico");
            sc.next();
        }
        return sc.nextInt();
    }

    public Double ValidarDecimal(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese un dato numerico");
            sc.next();
        }
        return sc.nextDouble();
    }
}
