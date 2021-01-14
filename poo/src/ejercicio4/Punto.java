//Definir una clase llamada Punto con un constructor que inicialice las coordenadas x e y.
//Generar dos instancias, es decir, crear dos objetos llamados punto1 y punto2 y comprobar la
//distancia que existe entre ambos. Para conocer como calcular la distancia entre dos puntos
//consulte el siguiente link:
package ejercicio4;


public class Punto {
   private Integer x;
   private Integer y;

    public Punto() {
    }

    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }
   
   public double distancia (Punto a, Punto b){
      double distancia;
       
       distancia = Math.sqrt(Math.pow((b.x - a.x),2)+ Math.pow((b.y-a.y), 2));
       
       return distancia;
       
   }
   
}
