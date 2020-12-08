//40. Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
//que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero
//cambiada de signo. Es decir, A es antisimétrica si A = -AT
//
//. La matriz traspuesta de una
//
//matriz A se denota por A
//
//T y se obtiene cambiando sus filas por columnas (o viceversa).
package ejercicio40;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio40 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
           System.out.println("ingrese la dimesion de la matriz");  
           int n= sc.nextInt();
       
       int[][] matriz1 = new int[n][n];
       int[][] matriz2 = new int[n][n];
        System.out.println("ingrese los valores de la matriz 1 ");
        llenarMatriz(matriz1, n);
        System.out.println("ingrese los valores del amatriz 2");
        llenarMatriz(matriz2, n);
        System.out.println("MATRIZ 1");
        mostrarMatriz(matriz1, n);
        System.out.println("MATRIZ 2");
        mostrarMatriz(matriz2, n);
        
        corroborarT(matriz1, matriz2, n);
       
        }
    
    static void llenarMatriz(int[][] matriz,int n){
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("ingrese el la fila "+ i + " y la columna " + j);
                matriz[i][j]=sc.nextInt();
            }
        }
        
    }
    
    static void mostrarMatriz(int[][] matriz,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    
    static void corroborarT (int[][] matriz1,int[][] matriz2,int n){
        boolean transpuesta = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz1[i][j]*-1 != matriz2[j][i] ){
                   transpuesta = false; 
                }
            }
        }
        if (transpuesta) {
            System.out.println("la matriz 1 y la matriz 2 SON ANTISIMETRICAS");
        }else{
            System.out.println("la matriz 1 y la matriz 2 NO son antisimetricas");
        }
 
    }
    }
    
        
        
        
        
  