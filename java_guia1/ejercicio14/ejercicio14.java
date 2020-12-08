
package ejercicio14;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio14 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        String letra, mayusLetra;
        int length;
        
        System.out.println("ingrese una letra para verificar si es vocal");
        letra = sc.next();
        length = letra.length();
        mayusLetra = letra.toUpperCase();
        if (length ==1) {
            if (mayusLetra.equals("A") || mayusLetra.equals("E") ||  mayusLetra.equals("I") || mayusLetra.equals("O") || mayusLetra.equals("U")  ) {
                
                System.out.println("La letra que ingreso es una vocal");
                
                
                
            }else {
                System.out.println("la letra que ingreso NO es vocal.");
            }
            }else {
            System.out.println("ERROR!! ingreso mas de una letra. ");
        }
      
        
        
        
        
        
        
        
        
        }
        
        
        
        
        
    }
    

