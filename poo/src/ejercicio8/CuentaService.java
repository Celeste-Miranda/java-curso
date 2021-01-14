//Método actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario (interés
//anual dividido entre 365 aplicado al saldo actual)
//• Método ingresar(double): permitirá ingresar una cantidad en la cuenta bancaria.
//• Método retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
package ejercicio8;


public class CuentaService {
   public Cuenta crearCuenta (int numeroCuenta,int dni,double saldoActual, double interesAnual){
       
       Cuenta cuenta=new Cuenta();
       
      
      cuenta.setNumeroCuenta(numeroCuenta);
      cuenta.setDni(dni);
      cuenta.setSaldoActual(saldoActual);
      cuenta.setInteresAnual(interesAnual);
       
      return cuenta;
       
   }
   
    public double actualizarSaldo(double interes,double saldo){
        
       double interesDiario = interes/365;
       
       double saldoActual = saldo + interesDiario;
       
       return saldoActual;
        
               
    }
    
    
    public double ingresar( double ingreso, double saldo){
         
        double saldoActual= saldo + ingreso;
        
        return saldoActual;
       
        
    }
            
    public double retirar ( double retiro, double saldo){
        
        double saldoActual= saldo - retiro;
        
        return  saldoActual;
        
        
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("su saldo es: $"+ cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.printf("N° cuenta %d\n dni %d\n saldo actual $ %f\n interes anual %f\n  ", 
                cuenta.getNumeroCuenta(), cuenta.getDni(), cuenta.getSaldoActual(), cuenta.getInteresAnual() );
        
        
        
    }
    
    
}
