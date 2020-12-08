//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
//P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
//contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
//submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
//columnas, existe al menos una que coincida con la matriz P. En ese caso, el programa
//debe indicar la fila y la columna de la matriz M en la cual empieza el primer elemento
//de la submatriz P.
package ejercicio42;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio42 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
      int[][] m=new int [10][10];
      int [][] p =new int [3][3];
        System.out.println("matriz m");
        llenarMatriz(m);
        System.out.println("matriz p");
        llenarMatriz(p);
        
        comparar(m, p);
        
        
        
    
    
    }
    
    static void llenarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (Math.random()*2);

                System.out.print(" [" + matriz[i][j] + "] ");

            }
            System.out.println("");
        }
    }

    static void comparar(int[][] m, int[][] p) {
        int contador=0, coincidencias=0 ;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                

                if (i <= 7 && j <= 7) {
                    if (m[i][j] == p[0][0]) {
                        contador=0;

                        for (int k = 0; k < p.length; k++) {
                            for (int l = 0; l < p.length; l++) {

                                if (m[i + k][j + l] == p[k][l]) {
                                    contador++;

                                }
                            }
                        }
                        if (contador == Math.pow(p.length, 2)) {
                            System.out.println("se encontro coincidencia en las coordenada " + i + " y "+ j );
                            coincidencias++;
                        }

                    }
                }
            }

        }
        
        if (coincidencias<1) {
            System.out.println("NO se encontro ninguna coincidencia");
            
        } else  {
            System.out.println("se encontraron"+ coincidencias+"coincidencias");
        }

    }

}
