//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
package ejercicio36;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio36 {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.println("ingrese la dimension del vector");
        int n=sc.nextInt();
        int[] vector1=new int[n];
        int[] vector2= new int [n];
        int contador=0, m=n;
        llenarVector(vector1,n);
        llenarVector(vector2,n);
        
        if (vector1[n-1] == vector2[n-1]) {
            do {
                contador++;
                if (n>0) {
                    n--;
                }

            } while (vector1[n] == vector2[n] && n>0 );

            if (contador == m) {
                System.out.println("los vectores con iguales");
            }else {
            System.out.println("los vectores son diferentes");
        }

        } else {
            System.out.println("los vectores son diferentes");
        }


     
          
            
             
        }
    
    
    
    static void llenarVector(int[] vector, int n){
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el valor del vector ["+i+"]");
             vector[i]=sc.nextInt();
        }
        
    }
}
