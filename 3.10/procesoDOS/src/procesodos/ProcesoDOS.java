/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesodos;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoDOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* En un supermercado una ama de casa pone en su carrito los artículos que va
tomando de los estantes. La señora quiere asegurarse de que el cajero le cobre
bien lo que ella ha comprado, por lo que cada vez que toma un artículo anota su
precio junto con la cantidad de artículos iguales que ha tomado y determina
cuánto dinero gastara en ese artículo; a esto le suma lo que ira gastando en los
demás artículos, hasta que decide que ya tomo todo lo que necesitaba. Ayúdale a
esta señora a obtener el total de sus compras
*/
        Scanner scan = new Scanner(System.in);
        int valProc, valTotal =0;
        do{
            System.out.println("escriba el valor del producto");
            System.out.println("o escriba cero si ya no compraras mas productos");
            valProc = scan.nextInt();
            valTotal = valTotal+valProc;
            System.out.println("este es el valor total a pagar: "+valTotal);
        }while(valProc != 0);
       
       
    }
    
}
