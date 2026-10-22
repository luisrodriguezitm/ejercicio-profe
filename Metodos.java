import java.util.Scanner;

public class Metodos {
    public ObjDato[][] LLenar(Scanner sc) {
        int n = Pedirdimension(sc);
        ObjDato[][] m = new ObjDato[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjDato o = new ObjDato();
                o.setDato((int) (Math.random() * 50 + 1));
                m[i][j] = o;
            }
        }
        return m;
    }

    public static int Pedirdimension(Scanner sc) {
        System.out.println("Por Favor Ingrese la dimension de la matriz");
        return sc.nextInt();
    }

    public void Mostrar(ObjDato[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" - " + m[i][j].getDato());
            }
            System.err.println();
        }
    }

    public void DiagonalSuperior(ObjDato[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    System.out.println(" - " + m[i][j].getDato());
                }
            }
        }
    }

    public void DiagonalInferior(ObjDato[][] m) {

        int i = m.length -1 ;
        for (int j = 0; j < m.length; j++) {
            System.out.println(" - " + m[i][j].getDato());
            i--;

        }

    }
}
