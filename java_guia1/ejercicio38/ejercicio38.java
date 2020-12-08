//Crear una función rellene un vector con números aleatorios, pasándole un arreglo
//por parámetro. Esta función debe devolver el arreglo al main y pasarle el vector lleno a
//un procedimiento que imprima el vector.
package ejercicio38;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio38 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese la dimension del array");
        int n=sc.nextInt();
        int[] vector=new int[n];
        llenarVector(vector, n);
        mostrarVector(vector, n);
        
        
        
    }
    
    // ** LLENAR ARRAY**//
    static void llenarVector(int[] vector, int n) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int m;
        for (int i = 0; i < n; i++) {
            
            vector[i] = (int)(Math.random()*100);
            
        }
        
    }
    // **MOSTRAR ARRAY**//
    static void mostrarVector(int[] vector, int n){
    
    for (int i = 0; i < n; i++) {
        System.out.print (" [" + vector[i]+"] ");
    }
}
}
