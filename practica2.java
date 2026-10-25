import java.util.Scanner;

public class practica2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        System.out.println("---📝📝//INGRESE LOS VALORES DE LA MATRIZ//📝📝---");
        llenarMatriz(matriz, sc);
        System.out.println();
        System.out.println("---//LA MATRIZ ES//---");
        mostrarMatriz(matriz);
        System.out.println();
        System.out.println("---➕//LA SUMA DE LA MATRIZ ES//➕---");
        sumarMatriz(matriz);
        System.out.println();
        System.out.println("--//LAS DIAGONALES SON//---");
        principalYsecundaria(matriz);
    }//cierre main
    public static void llenarMatriz(int[][] matriz, Scanner sc)
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public static void sumarMatriz(int[][] matriz)
    {
       int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println(suma);
    }
    public static void principalYsecundaria(int[][] matriz) {
        System.out.println("↘️↘️PRINCIPAL↘️↘️");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i] + " | ");
        }
        System.out.println();
        System.out.println("↙️↙️SECUNDARIA↙️↙️");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][matriz.length -1 -i] + " | ");
        }
    }

}//cierre class

