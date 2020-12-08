//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
package ejercicio30;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio30 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("ingrese un numero"); 
        int num=sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (i==0) {
                System.out.print(num +" *");
            }else{
                System.out.print("*");
            }
            
        }
        System.out.println("");
        
        
        
        
        
    }
    
}
