//Crea una aplicación que le pida dos numeros al usuario y este pueda elegir entre
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
//operación matemática y deben devolver sus resultados para imprimirlos en el main.
package ejercicio31;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio31 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        double n1,n2;
        int respuesta;
        
        System.out.println("ingrese dos numeros");
        n1=sc.nextDouble();
        n2=sc.nextDouble();
       
        do {
            System.out.println("ingrese la opcion deseada");
            System.out.println("1 - sumar");
            System.out.println("2 - restar");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("5 - salir");
            
            respuesta= sc.nextInt();
            
                
             switch (respuesta){
                 case 1: System.out.println(sumar(n1,n2)); 
                 break;
                 case 2: System.out.println(restar(n1,n2)); 
                 break;
                 case 3: System.out.println(multiplicar(n1,n2));  
                 break;
                 case 4: System.out.println(dividir(n1,n2));  
                 break;
                 case 5: System.out.println("eligio salir!! hasta luego"); 
                 
             } 
            
        } while (respuesta!=5);
        
        
        
        
        
        
        
        
    }
    
    static double sumar (double num1,double num2){
                
         return (num1+num2); 
         
    }
       
     static double restar (double num1,double num2){
                
         return (num1-num2); 
    } 
     static double multiplicar (double num1,double num2){
                
         return (num1*num2); 
    }
    static double dividir (double num1,double num2){
                
         return (num1/num2); 
    }
    
    
    
    
}
