//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.
package ejercicio13;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio13 {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int num;
        String romano;

        System.out.println("ingrese un numero del 1 al 10");
        num = sc.nextInt();
        
        romano="";

        if (num <= 10) {
            switch (num) {
                case 1:
                    romano = "I";
                    
                    break;
                case 2:
                    romano = "II";
                    break;
                case 3:
                    romano = "III";
                    break;
                case 4:
                    romano = "IV";
                    break;
                case 5:
                    romano = "V";
                    break;
                case 6:
                    romano = "VI";
                    break;
                case 7:
                    romano = "VII";
                    break;
                case 8:
                    romano = "VIII";
                    break;
                case 9:
                    romano = "IX";
                    break;
                case 10:
                    romano = "X";
                    break;

            }
            
        }else {
            System.out.println("valor  invalido. fuera del rango (1-10)");
        }
      
        
        System.out.println("el numero " + num + " en numero romano es "+ romano);
        
        
    }
    
}
