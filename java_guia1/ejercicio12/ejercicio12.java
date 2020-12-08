//12. La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando se
//realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los
//primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, $ 0.80 c/u, los siguientes
//dos minutos, 0.70 c/u, y a partir del décimo minuto, 0.50 c/u. Además, se carga un
//impuesto de 3 % cuando es domingo, y si es día hábil, en turno matutino, 15 %, y en
//turno vespertino, 10 %. Realice un algoritmo para determinar cuánto debe pagar por
//cada concepto una persona que realiza una llamada (tiempo de la llamada, impuestos
//y total a pagar). Al analizar el problema se puede identificar que será necesario conocer
//como datos la duración de la llamada, así como el día y turno en que se realiza. Con
//base en esto se podrá determinar cuál será el pago que se efectuará por el tiempo que
//dura la llamada y el impuesto que deberá pagar en función del día y del turno en que se
//realiza.

package ejercicio12;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        double minutos, precio;
        String dia, mayudia, turno, mayuturno;

        System.out.println("ingrese la cantidad de minutos ");
        minutos = sc.nextDouble();

        System.out.println("ingrese el dia");
        dia = sc.next();
        mayudia = dia.toUpperCase();

        System.out.println("ingrese el turno de llamada ( M : matutino ; V:vespertino)");
        turno = sc.next();
        mayuturno = turno.toUpperCase();
        precio = 0;

        if (minutos > 5) {
            if (minutos <= 8) {
                precio = 5 + ((minutos - 5) * 0.80);
            }
            else if (minutos <= 10) {
                precio = 5 + (3 * 0.80) + (minutos - 8) * 0.70;
            }
            else if (minutos > 10) {
                precio = 5 + (3 * 0.80) + 2 * 0.70 + 0.50 * (minutos - 10);
            }

        } else {
            precio = minutos * 1;
        }

        switch (mayudia) {
            case "DOMINGO":
                precio = precio * 1.03;
                System.out.println(" el tiempo de llamada es " + minutos + " la cual posee un recargo de 3% . El total a pagar es " + precio);
                break;
            case "SABADO":
                
                System.out.println(" el tiempo de llamada es " + minutos + " la cual no  posee recargo  . El total a pagar es " + precio);
            default:
                if (mayuturno.equals("M")) {
                    precio = precio * 1.15;
                    System.out.println(" el tiempo de llamada es " + minutos + " la cual posee un recargo de 15% . El total a pagar es " + precio);

                } else if (mayuturno.equals("V")) {
                    precio = precio * 1.10;
                    System.out.println(" el tiempo de llamada es " + minutos + " la cual posee un recargo de 10% . El total a pagar es " + precio);

                }

        }

          
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
