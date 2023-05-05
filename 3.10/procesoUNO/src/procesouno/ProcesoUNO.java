/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesouno;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoUNO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  En una tienda de descuento las personas que van a pagar el importe de su compra
llegan a la caja y sacan una bolita de color, que les dirá que descuento tendrán
sobre el total de su compra. Determinar la cantidad que pagara cada cliente desde
que la tienda abre hasta que cierra. Se sabe que si el color de la bolita es roja el
cliente obtendrá un 40% de descuento; si es amarilla un 25% y si es blanca no
obtendrá descuento*/
        
      
       
        
        Scanner scan = new Scanner(System.in);
        double valCompra, suma;
        suma=0;
        do{
            int ramdon= (int) (Math.random()*3)+1;
            System.out.println("escriba el valor de compra del cliente");
            System.out.println("o escriba cero si ya no hay mas clientes");
            valCompra= scan.nextInt();

                        switch (ramdon) {
                case 1:
                    System.out.println("la bolita salio roja");
                    System.out.println("el cliente obtendrá un 40% de descuento");
                    valCompra= valCompra*0.4;
                    break;
                    case 2:
                    System.out.println("la bolita salio amarilla");
                        System.out.println("el cliente obtendrá un 40% de descuento");
                    
                    valCompra= valCompra*0.25;
                    break;
                    case 3:
                    System.out.println("la bolita salio blanca");
                     System.out.println("no tendra descuento");
                    break;
                default:
                    throw new AssertionError();
            }
                        suma= suma+valCompra;
            System.out.println("este es el valor que el cliente debe pagar:  "+valCompra);
            System.out.println("es el total que los clients pagaron en el dia:  "+suma);
            System.out.println("");
        }while(valCompra!=0);
        // TODO code application logic here
    }
    
}
