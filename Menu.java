import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validacion v = new Validacion();
        int n = m.PedirDimension(sc, v);
        ObjVenta[][] Matriz = new ObjVenta[n][n];
        boolean seguir = true;
        while (seguir) {
            switch (m.Menu(sc, v)) {
                case 1:
                    Matriz = m.LLenar(Matriz, sc, v);
                    break;
                case 2:
                    m.MostrarVentas(Matriz);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("hasta luego");
                    seguir = false;
                    break;

                default:
                    System.out.println("Opción no existe");
                    break;
            }
        }
    }
}
