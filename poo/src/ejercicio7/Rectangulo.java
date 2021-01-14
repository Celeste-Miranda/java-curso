
package ejercicio7;

import java.util.Locale;
import java.util.Scanner;


public class Rectangulo {
    
    private Integer largo;
    private Integer alto;

    public Rectangulo(Integer largo, Integer alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }
    
    public void ingresarDatos(){
        
      Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrete el largo (base) del rectangulo");
      this.largo = sc.nextInt();
        System.out.println("ingrese la altura del rectangulo");
      this.alto= sc.nextInt();
        
        
    }
    
    public double superficie() {
        
        
       double superficie = this.largo * this.alto;
        return superficie;
        
        
    }
     
    public double perimetro (){
        
        double perimetro = (this.alto+this.largo)*2;
        return perimetro;
    }
    
    
    public void dibujoRectangulo(Rectangulo a){
        
        for (int i = 0; i < a.alto; i++) {
            for (int j = 0; j < a.largo; j++) {
              if (i==0 || i == a.alto-1) {
                
                   System.out.print("*");
            
            } else if (j==0 || j == a.largo-1  ) {
                    System.out.print("*");
                }
              else  {
                System.out.print(" ");
            }  
            }
            System.out.println(""); 
        }
        
        
    }
          
    
    
}
