//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
//los muestre por pantalla en orden descendente.
package ejercicio35;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio35 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int[] vector=new int[100];
        
        for (int i = 0; i < 100; i++) {
            vector[i]=100-(i);
            System.out.print(" ["+vector[i]+"] ");
        }
        
    }
    
}
