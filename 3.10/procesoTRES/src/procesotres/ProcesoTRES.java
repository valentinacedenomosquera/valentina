/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesotres;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoTRES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Un teatro otorga descuentos según la edad del cliente. determinar la cantidad de
dinero que el teatro deja de percibir por cada una de las categorías. Tomar en
cuenta que los niños menores de 5 años no pueden entrar al teatro y que existe un
precio único en los asientos. Los descuentos se hacen tomando en cuenta el
siguiente cuadro:
Edad Descuento
Categoría 1 5 - 14 35 %
Categoría 2 15 - 19 25 %
Categoría 3 20 - 45 10 %
Categoría 4 46 - 65 25 %
Categoría 5 66 en adelante 35 %
*/
        
        Scanner scan = new Scanner(System.in);
        int edad, precio;
        double perdida= 0;
        System.out.println("ingrese el valor del ticket del teatro");
        precio = scan.nextInt();
        
        do{
            System.out.println("escribe la edad del cliente");
            System.out.println("si son menores de cinco años no pueden entrar");
            System.out.println("si no hay mas clientes escriba -1");
            edad = scan.nextInt();
            
            if(edad>=5 & edad<=14){
                perdida= precio/0.35;
            }else if(edad>=15 & edad<=19){
                perdida= precio/0.25;
            }else if(edad>=20 & edad<=45){
                perdida= precio/0.10;
            }else if(edad>=46 & edad<=65){
                perdida= precio/0.25;
            }else if(edad>=66){
                perdida= precio/0.35;
            }else if(edad<=4 & edad>=0){
                System.out.println("no puede entrar");
            }
            System.out.println("el dinero descontado es: "+perdida);
        }while(edad!=-1);
        
        
        
    }
    
}
