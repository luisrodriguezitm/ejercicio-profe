import java.util.Scanner;

public class Metodos {
    public int MenuModulo(Scanner sc) {
        System.out.println("Bienvenido al sistema Logica S.A");
        System.out.println("1) Inventario");
        System.out.println("2) Facturación");
        System.out.println("3) Salir");
        return sc.nextInt();
    }

    public Repuestos[][] ModuloInventario(Repuestos[][] R, Scanner sc) {
        MetodosInventario m = new MetodosInventario();
        R = m.LLenarInventario(R, sc);
        return R;
    }
}
