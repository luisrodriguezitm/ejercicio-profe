import java.util.Scanner;

public class MetodosInventario {
    public Repuestos[][] LLenarInventario(Repuestos[][] R, Scanner sc) {
        int idRepuesto = 1;
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                Repuestos o = new Repuestos();
                o.setIdrepuesto(idRepuesto);
                idRepuesto++;
                System.out.println("Ingrese la Descripción de repuesto");
                o.setDescripcion(sc.next());
                System.out.println("Ingrese la cantidad respuestos");
                o.setCantidad(sc.nextInt());
                System.out.println("Cual es el stock minimo del repuesto");
                o.setStockMinimo(sc.nextInt());
                System.out.println("Ingrese la categoria 1,2,3,4,5");
                o.setCategoria(sc.nextInt());
                System.out.println("Ingrese el precio unitario del Repuesto");
                o.setPrecio(sc.nextDouble());
                R[i][j] = o;

            }
        }
        return R;
    }

    public Repuestos[][] LLenarInventarioConstructor(Repuestos[][] R, Scanner sc) {
        int idRepuesto = 1;
        String Descripcion = "";
        int Cantidad = 0;
        int StockMinimo = 0;
        Double Precio = 0.0;
        int Categoria = 0;
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                System.out.println("Ingrese la Descripción de repuesto");
                Descripcion = sc.next();
                System.out.println("Ingrese la cantidad respuestos");
                Cantidad = sc.nextInt();
                System.out.println("Cual es el stock minimo del repuesto");
                StockMinimo = sc.nextInt();
                System.out.println("Ingrese la categoria 1,2,3,4,5");
                Categoria = sc.nextInt();
                System.out.println("Ingrese el precio unitario del Repuesto");
                Precio = sc.nextDouble();
                Repuestos o = new Repuestos(idRepuesto, Descripcion, Cantidad, StockMinimo, Precio, Categoria);
                R[i][j] = o;

            }
        }
        return R;
    }

    public void MostrarInventario(Repuestos[][] R) {
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {

                System.out.println("Identificación del Repuesto: " + R[i][j].getIdrepuesto());
                System.out.println("Descripcion: " + R[i][j].getDescripcion());
                System.out.println("Cantidad de Repuestos: " + R[i][j].getCantidad());
                System.out.println("El stock minimo del  Repuesto: " + R[i][j].getStockMinimo());
                System.out.println("La Catagoria es: " + R[i][j].getCategoria());
                System.out.println("Precio Unitario: " + R[i][j].getPrecio());
                System.out.println("--------------------------------------------------------- \n");

            }
        }
    }

    public Repuestos[][] Modificar(Repuestos[][] R, Scanner sc) {
        int Nro = SolicitarNumeroRepuesto(sc);
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                if (R[i][j].getIdrepuesto() == Nro) {
                    System.out.println("Ingrese la cantidad respuestos");
                    R[i][j].setCantidad(R[i][j].getCantidad() + sc.nextInt());
                    System.out.println("Ingrese el precio unitario del Repuesto");
                    R[i][j].setPrecio(sc.nextDouble());

                }
            }
        }
        return R;
    }

    public Repuestos[][] Eliminar(Repuestos[][] R, Scanner sc) {
        int Nro = SolicitarNumeroRepuesto(sc);
        for (int i = 0; i < R.length; i++) {
            for (int j = 0; j < R.length; j++) {
                if (R[i][j].getIdrepuesto() == Nro) {
                    R[i][j].setIdrepuesto(0);

                }
            }
        }
        return R;
    }

    public static int SolicitarNumeroRepuesto(Scanner sc) {
        System.out.println("Ingrese el numero del repuesto");
        return sc.nextInt();
    }
}
