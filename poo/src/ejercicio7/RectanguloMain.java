/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author modamary
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo();
        
        rectangulo.ingresarDatos();
              
        
        System.out.println("superficie: "+ rectangulo.superficie());
        System.out.println("perimetro: " + rectangulo.perimetro());
    
        rectangulo.dibujoRectangulo(rectangulo);
    }
    
}
