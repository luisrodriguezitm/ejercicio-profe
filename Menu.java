import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        System.out.println("Bienvenido a logica food");
        System.out.println("que desea realizar");
        while (continuar) {
            switch (m.menu(sc)) {
                case 1:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 2:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 3:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 4:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 5:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 6:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 7:
                    System.out.println("pagina en mantenimiento");
                    break;

                case 8:
                    System.out.println("hasta luego");
                    continuar = false;
                    break;

                default:
                    System.out.println("esta opcion no existe por favor valide");
                    break;
            }
        }
    }
}
