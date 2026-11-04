import java.util.Scanner;

public class Metodos {

    public int Menu(Scanner sc, Validacion v) {
        System.out.println("Bienvenidos mini mercado harby");
        System.out.println("1) Ingresar Ventas");
        System.out.println("2) Mostrar Ventas");
        System.out.println("3) Buscar Venta");
        System.out.println("4) Modificar Venta");
        System.out.println("5) Cancelar Venta");
        System.out.println("6) Eliminar Venta");
        System.out.println("7)Informe de ventas");
        System.out.println("8) Salir");
        return v.ValidarEntero(sc);
    }

    private static int NumFactura(int n) {
        return ++n;
    }

    private static String Nombres(Scanner sc, int opt) {
        switch (opt) {
            case 1:
                System.out.println("Por favor Ingrese el nombre del cliente");
                break;
            case 2:
                System.out.println("Por favor Ingrese el nombre del vendedor");
                break;

            default:
                System.out.println("Por favor Ingrese el Motivo");
                break;
        }

        return sc.next();
    }

    private static Double TotalVenta(Scanner sc, Validacion v) {
        System.out.println("Ingrese el total de la venta");
        return v.ValidarDecimal(sc);
    }

    private static int CantidadArticulos(Scanner sc, Validacion v) {
        System.out.println("Ingrese la cantidad de articulos vendidos");
        return v.ValidarEntero(sc);
    }

    public ObjVenta[][] LLenar(ObjVenta[][] m, Scanner sc, Validacion v) {
        int nf = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjVenta o = new ObjVenta(NumFactura(nf), Nombres(sc, 1), Nombres(sc, 2), TotalVenta(sc, v),
                        CantidadArticulos(sc, v), null, 1);
                m[i][j] = o;
                nf++;
            }
        }
        return m;
    }

    public void MostrarVentas(ObjVenta[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Numero Factura: " + m[i][j].getNumFactura());
                System.out.println("Nombre del Cliente: " + m[i][j].getNombreCliente());
                System.out.println("Nombre Vendedor: " + m[i][j].getNombrevendedor());
                System.out.println("Tota Venta: " + m[i][j].getTotalVenta());
                System.out.println("Cantidad Articulos: " + m[i][j].getCantidadArticulos());
                System.out.println("Motivo: " + m[i][j].getMotivo());
                System.out.println("Estado Venta: " + m[i][j].getEstadoVenta());
                System.out.println("--------------------------------------------------------");
            }
            System.out.println();
        }
    }

    public int PedirDimension(Scanner sc, Validacion v) {
        System.out.println("Por favor Ingrese la dimensión de la matriz");
        return v.ValidarEntero(sc);
    }

}
