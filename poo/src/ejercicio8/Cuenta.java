
package ejercicio8;


public class Cuenta {
  
    //atributos
    
    private Integer numeroCuenta;
    private Integer dni;
    private double saldoActual;
    private double interesAnual;


//constructores

    public Cuenta() {
    }

    public Cuenta(Integer numeroCuenta, Integer dni, double saldoActual, double interesAnual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }


    
    
    
    
    
    
}
