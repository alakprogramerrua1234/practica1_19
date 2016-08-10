
package jerarquia_circulo_cilindro_cilindrohueco;

import java.util.Scanner;


public class Jerarquia_circulo_cilindro_cilindrohueco {

    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);  
        circulo firstcircle = new circulo();
        cilindro firstcylinder = new cilindro();
        cilindrohueco firsthollowcyl = new cilindrohueco();
        
        int men;
        
        do{
        
            System.out.println("CIRCULO Y OTROS");

            System.out.println("1.CIRCULO");
            System.out.println("2.CILINDRO");
            System.out.println("3.CILINDRO HUECO");
            System.out.println("4.SALIR");
            men = lectura.nextInt();

            
            switch(men){

               case 1: firstcircle.area_triangulo();
                   break;
               case 2: firstcylinder.area_circulo();
                   break;
               case 3: firsthollowcyl.area_circulo();
                   break;
           }
       
       }while(men!=4);
    }
    
}
