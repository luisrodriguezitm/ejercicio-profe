import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        ObjDato[][] matriz = m.LLenar(sc);
        m.Mostrar(matriz);
        System.out.println("mostrar matriz diagonal Superior");
        m.DiagonalSuperior(matriz);
        System.out.println("Diagonal inferior");
        m.DiagonalInferior(matriz);
    }
}
