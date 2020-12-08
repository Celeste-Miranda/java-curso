//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
//si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
package ejercicio16;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
    int n;
        System.out.println("ingrese un valor");
        n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
