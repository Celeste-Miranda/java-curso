//Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores:
//un constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
//además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
package ejercicio5;


public class Tiempo {
  
    // atributos
    
    private Integer horas;
    private  Integer minutos;
    private  Integer segundos;

    public Tiempo() {
    }

    public Tiempo(Integer horas, Integer minutos, Integer segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }
    
    
    public void imprimirHoraCompleta(){
        
        System.out.println("la hora es " + this.horas +":"+ this.minutos +":"+this.segundos); 
        
    }
    
    
    
    
}
