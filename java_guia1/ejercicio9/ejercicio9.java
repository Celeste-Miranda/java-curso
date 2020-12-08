//Escribir un programa que permita ingresar dos valores reales de las coordenadas X
//e Y de un punto del plano cartesiano. Luego, el programa debe mostrar una leyenda
//que indique a qué cuadrante pertenece el punto, o en su defecto, si el punto se
//encuentra sobre alguna de las cuatro ramas de los ejes cartesianos:

package ejercicio9;

import java.util.Locale;
import java.util.Scanner;


public class ejercicio9 {

   
    public static void main(String[] args) {
          
       Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        int x,y;
        
        System.out.println("ingrese el valor x");
        x=sc.nextInt();
        System.out.println("ingrese el valor y");
        y=sc.nextInt();
        
        if (x>=0 && y>=0) {
            System.out.println("el valor se encuentra en el PRIMER CUADRANTE");
           
            if (x==0 ) {
                System.out.println("el valor sobre el eje x ");
                else if (y==0) {
                System.out.println("el valor sobre el eje y ");
}
   
            }
            
            
    }
            
      
    
    
    }
    
}
