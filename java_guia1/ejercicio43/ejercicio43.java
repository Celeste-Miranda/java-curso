//43. El proceso de construcción de sillas de oficina se realiza en 5 fases (A, B, C, D, E)
//que se pueden realizar en 6 máquinas diferentes (1 ... 6). Se necesita calcular el costo
//máximo y mínimo tanto para fases como para máquinas. En la tabla siguiente se
//muestra la relación costo-proceso-máquina que estos eventos conllevan:
package ejercicio43;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio43 {

   
    public static void main(String[] args) {
       
        int[][] matriz= new int[6][5];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        validacionMatriz(matriz);
        
        
    }
    
    static void llenarMatriz(int[][] matriz) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] =sc.nextInt();

                

            }
            
        }
    }
    static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

    }

    static void validacionMatriz(int[][] matriz) {

        int maxMaq = 0, minMaq, maxFase = 0, minFase;

        int[] vector = new int[11];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[i] = vector[i] + matriz[i][j];
                if (i != 5) {
                    vector[i + 6] = vector[i + 6] + matriz[j][i];

                } else {
                    vector[6 + j] = vector[6 + j] + matriz[i][j];
                }

            }
        }

        minMaq = vector[0];
        minFase = vector[6];

        for (int i = 0; i < 11; i++) {
            if (i < 6) {

                if (vector[i] >= maxMaq) {
                    maxMaq = vector[i];

                }
                if (vector[i] <= minMaq) {
                    minMaq = vector[i];
                }

            } else {
                if (vector[i] >= maxFase) {
                    maxFase = vector[i];

                }
                if (vector[i] <= minFase) {
                    minFase = vector[i];
                }

            }
        }
        
        
        System.out.println("maximo maquina"+maxMaq);
        System.out.println("minimo maquina"+minMaq);
        System.out.println("maximo fase"+maxFase);
        System.out.println("minimo fase"+minFase);

    }


    
    
}
