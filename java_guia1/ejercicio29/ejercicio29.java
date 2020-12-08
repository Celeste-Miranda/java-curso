//Se dispone de un conjunto de N familias, cada una de las cuales tiene un M número
//de hijos. Escriba un programa para averiguar la media de edad de los hijos de todas las
//familias.
package ejercicio29;

import java.util.Locale;
import java.util.Scanner;


 
public class ejercicio29 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        int m,n,edad, sumatoria=0, contador=0, sumatoriaTotal=0, contadorTotal=0;
        System.out.println("ingrese la cantidad de familias");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese la cantidad de hijo que tiene la familio "+ (i+1));
          
            m=sc.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.println("ingrese las edades del hijo"+(j+1) );
                edad= sc.nextInt();
                sumatoria = sumatoria + edad;
                contador++;
            }
            contadorTotal= contadorTotal+contador;
            sumatoriaTotal= sumatoriaTotal+ sumatoria;
        }
        
        
        System.out.println("el promedio de la edad de los hijos es " + (sumatoriaTotal/contadorTotal));
        
        
        
    }
    
}
