//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicio37;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese la dimension del vector");
        int n = sc.nextInt();
        int control, contador=0, cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;

        int[] vector = new int[n];
        llenarVector(vector, n);
        mostrarVector(vector, n);
        
        for (int i = 0; i < n; i++) {
            control=vector[i];   
            do {
                   
                control = control/10;
                contador++;
                System.out.println(control);
            } while (control>=1);
            
             switch (contador) {
                case 1: cont1++;
                    
                    break;
                case 2: cont2++;
                break;
                case 3: cont3++;
                        break;
                case 4: cont4++;
                        break;
                case 5: cont5++;
                        break;
                
                    
            }
                
            contador=0;
        }
        
        System.out.println("la cantidad de valores de 1 digito es "+ cont1);
        System.out.println("la cantidad de valores de 2 digito es "+ cont2);
        System.out.println("la cantidad de valores de 3 digito es "+ cont3);
        System.out.println("la cantidad de valores de 4 digito es "+ cont4);
        System.out.println("la cantidad de valores de 5 digito es "+ cont5);
        

    }

    static void llenarVector(int[] vector, int n) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el valor del vector [" + i + "]");
            vector[i] = sc.nextInt();
            
        }
        
    }
static void mostrarVector(int[] vector, int n){
    
    for (int i = 0; i < n; i++) {
        System.out.print (" [" + vector[i]+"] ");
    }
}


}


