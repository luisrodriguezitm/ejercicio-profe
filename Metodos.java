import java.util.Scanner;

public class Metodos {
    Validacion v = new Validacion();

    public int menu(Scanner sc) {

        System.out.println("1) regitrar ventas");
        System.out.println("2) Mostrar ventas");
        System.out.println("3) Buscar Venta");
        System.out.println("4) Modificar venta");
        System.out.println("5) Cancelar Venta");
        System.out.println("6) Eliminar Venta");
        System.out.println("7) Generar Informe");
        System.out.println("8) Salir");
        int num = v.ValidarEntero(sc);
        return num;

    }

    public int NumeroFactura(int n) {
        return n++;
    }

    public String Nombre(int opt, Scanner sc) {
        switch (opt) {
            case 1:
                System.out.println("Ingrese el nombre del Cliente");
                break;

            default:
                System.out.println("Ingrese el nombre del vendedor");
                break;
        }
        return sc.next();
    }

    public Double Venta(Scanner sc) {
        System.out.println("Ingrese el valor de la venta");
        return v.ValidarDecimal(sc);
    }

}
