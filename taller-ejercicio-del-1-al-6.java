import java.util.Scanner;
public class matrizmetodos2
{
    public static void main(String[] args)
    {
        int[][] matriz = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE VALORES");
        llenarMatriz(matriz, sc);
        System.out.println();
        System.out.println("SU MATRIZ ES");
        mostrarMatriz(matriz);
        System.out.println();
        System.out.println("LA SUMA DE LA MATRIZ ES");
        sumarMatriz(matriz);
        System.out.println();
        System.out.println("LAS DIAGONALES SON:");
        principalYsecundaria(matriz);
        System.out.println("SUMA DE FILAS Y COLUMNAS");
        filasYcolumnas(matriz);
    }//cierra main
    public static void filasYcolumnas(int[][] matriz)
    {
        System.out.println();
        System.out.println("La suma de las Filas es:");
        int suma;
        for (int i = 0; i < matriz.length; i++)
        {
            suma = 0;
            for (int j = 0; j < matriz[i].length; j++)
            {
                suma += matriz[i][j];
            }
            System.out.println("fila " + (i + 1) + ": " + suma);

        }
        System.out.println();
        System.out.println("La suma de las columnas es:");
        for (int j = 0; j < matriz[0].length; j++) {
            suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            System.out.println("columna " + (j + 1) + ": " + suma);

        }
    }
        public static void llenarMatriz(int[][] matriz, Scanner sc)
        {
            for (int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz.length; j++)
                {
                    matriz[i][j] = sc.nextInt();
                }
            }
        }
        public static void mostrarMatriz(int[][] matriz)
        {
            for (int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz.length; j++)
                {
                    System.out.print(matriz[i][j] + " | ");

                }
                System.out.println();
            }
        }
        public static void sumarMatriz(int[][] matriz)
        {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz.length; j++)
                {
                    suma += matriz[i][j];
                }
            }
            System.out.println(suma);
        }
        public static void principalYsecundaria(int[][] matriz)
        {
            System.out.println("principal");
            for (int i = 0; i < matriz.length; i++)
            {
                for (int j = 0; j < matriz.length; j++)
                {
                    System.out.println(matriz[i][i] + " | ");
                }
                System.out.println("secundaria");
                System.out.println(matriz[i][matriz.length -1 -i] + " | ");
            }
        }
}//cierra class