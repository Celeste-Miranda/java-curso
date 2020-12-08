//Crea un aplicación que nos convierta una cantidad de euros introducida por
//teclado a otra moneda, estas pueden ser a dolares, yenes o libras. El procedimiento
//tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una
//cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio
//(void).
//El cambio de divisas son:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package ejercicio32;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio32 {

  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
      
        System.out.println("ingrese la cantidad de euros a convertir");
        double euros = sc.nextDouble();
        
    }
    
    
    static void cambioDivisa(double euros) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String divisa; 
        System.out.println("ingrese a que divisa quiere cambiar, (libra, dolares, yenes)");
        divisa= sc.next();
        
        switch (divisa) {
            case "libra": System.out.println(euros*0.86);
                
                break;
                case "dolares" : System.out.println(euros*1.28);
            default:
                throw new AssertionError();
        }
        
    }
}
