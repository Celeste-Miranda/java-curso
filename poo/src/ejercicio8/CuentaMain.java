
package ejercicio8;

import java.util.Locale;
import java.util.Scanner;



public class CuentaMain {

  
    public static void main(String[] args) {
        
       CuentaService cuentaService= new CuentaService();
       Cuenta cuenta;
       
       cuenta = cuentaService.crearCuenta(32651, 32683629, 5006.55, 29.5);
         
        menu(cuenta, cuentaService);
        
        
        
    }
    
    static void menu (Cuenta cuenta, CuentaService cuentaService){
        int num,ingreso,retiro;
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        do {
            System.out.println("\n ingrese la opcion deseada \n 1-MOSTRAR DATOS\n 2-INGRESAR DINERO\n 3-RETIRAR DINERO\n 4-ACTUALIZAR SALDO\n 5-CONSULTAR SALDO \n 6-SALIR\n");
            num= sc.nextInt();
            while (num==0 || num>6) {
               System.out.println("OPCION INVALIDA\n INGRESE UNA OPCION");  
               num=sc.nextInt();
            }
            
            switch (num) {
                case 1: cuentaService.consultarDatos(cuenta);
                    
                    break;
                case 2:System.out.println("cual es el monto a ingresar");
                       ingreso= sc.nextInt();
                   cuenta.setSaldoActual(cuentaService.ingresar(ingreso, cuenta.getSaldoActual())); 
                   break;
                case 3 : System.out.println("cual es el monto a retirar"); 
                        retiro = sc.nextInt();
                        cuenta.setSaldoActual(cuentaService.retirar(retiro, cuenta.getSaldoActual()));
                        break;
                case 4 : cuenta.setSaldoActual(cuentaService.actualizarSaldo(cuenta.getInteresAnual(), cuenta.getSaldoActual()));
                        break;
                case 5 :cuentaService.consultarSaldo(cuenta);
                        break;
                case 6 : System.out.println("MUCHAS GRACIAS");
                        break;
            }
               
            
        } while (num >=1 & num <=5 );
        
        
    }
    
}
