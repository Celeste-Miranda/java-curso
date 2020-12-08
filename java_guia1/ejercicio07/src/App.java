//Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla.
package(ejercicio7)

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
      

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US); 

System.out.println("ingrese el valor de m y n");
 int n,m;
 m =leer.nextInt(); 
 n= leer.nextInt();
  if (n>m) {
      System.out.println(n +"es mayor a "+m);
      else if {
          System.out.println(m+"es mayor a "+ n);
      }

  }

    }
}
