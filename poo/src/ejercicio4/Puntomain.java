
package ejercicio4;


public class Puntomain {

    
    public static void main(String[] args) {
      Punto punto1= new Punto();
      Punto punto2= new Punto ();
      
      punto1.setX(100);
      punto1.setY(100);
      punto2.setX(200);
      punto2.setY(200);
       
       
     System.out.println("la ditancia entre e punto 1 y el puento 2 es " + punto1.distancia(punto1, punto2)  );  
        
        
        
    }
    
}
