package ejercicio41;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int[][] matriz1 = new int[3][3];
        System.out.println("ingresar los valores de la matriz");
        llenarMatriz(matriz1);
        mostrarMatriz(matriz1);
        corroborarMagico(matriz1);
    }

    static void llenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese el la fila " + i + " y la columna " + j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    static void corroborarMagico(int[][] matriz) {
        int sumaHorizontal, sumaVertical, aux = 0, sumadiagonal1 = 0, sumadiagonal2 = 0;

        boolean magico = false, magicoH = false;

        for (int i = 0; i < 3; i++) {
            sumaVertical = 0;
            sumaHorizontal = 0;

            for (int j = 0; j < 3; j++) {
                sumaHorizontal = sumaHorizontal + matriz[i][j];
                sumaVertical = sumaVertical + matriz[j][i];
                if (i == j) {
                    sumadiagonal1 = sumadiagonal1 + matriz[i][j];
                }
                if (i + j == 2) {
                    sumadiagonal2 = sumadiagonal2 + matriz[i][j];

                }

            }

            if (i == 0 && sumaHorizontal == sumaVertical) {
                aux = sumaHorizontal;
            } else if (sumaHorizontal == sumaVertical && aux == sumaHorizontal) {
                magicoH = true;
            }

        }

        if (magicoH && aux == sumadiagonal1 && sumadiagonal1 == sumadiagonal2) {
            magico = true;
        }

        if (magico) {
            System.out.println("la matriz es MAGICA");
        } else {
            System.out.println("la matriz NO es magica");
        }

    }
}
