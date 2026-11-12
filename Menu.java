import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) {
            switch (m.MenuModulo(sc)) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Hasta Luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("Esta Opción no es valida");
                    break;
            }
        }
    }
}
