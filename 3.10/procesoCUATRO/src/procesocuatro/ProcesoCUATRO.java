/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesocuatro;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoCUATRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Calcular el promedio de masa de aire de los neumáticos de n vehículos que
están en compostura en un servicio de alineación y balanceo. Los vehículos
pueden ser motocicletas o automóviles.
*/
                double volumen, presion, temperatura, masa, masa2;
        int vehiculos;

        Scanner scan = new Scanner(System.in);
        System.out.println("TIPO DE VEHICULOS");
        System.out.println("1.MOTO");
        System.out.println("2.CARRO");

        System.out.println("");
        masa = 0;
        masa2 = 0;
        do {
            System.out.println("SELECCIONE SU VEHICULO");
           
            vehiculos=scan.nextInt();
            switch (vehiculos) {
                case 1:
                                    System.out.println("    MOTOS");
                System.out.println("INGRESE PRECION");
                presion = scan.nextDouble();
                System.out.println("INGRESE VOLUMEN");
                volumen = scan.nextDouble();
                System.out.println("INGRESE TEMPERATURA");
                temperatura = scan.nextDouble();
                masa = (presion * volumen) / (0.37 * (temperatura + 460));
                System.out.println("la masa es " + masa);
                    break;
               
                case 2: 
                                    System.out.println("    CARROS");
                System.out.println("INGRESE PRECION");
                presion = scan.nextDouble();
                System.out.println("INGRESE VOLUMEN");
                volumen = scan.nextDouble();
                System.out.println("INGRESE TEMPERATURA");
                temperatura = scan.nextDouble();
                masa = (presion * volumen) / (0.37 * (temperatura + 460));
                System.out.println("la masa es " + masa);
                    break;
                     default:
                         System.out.println("NO TENEMOS ESE TIPO DE VEHICULO");
            }
           


masa2= (masa2+masa)/2;
            System.out.println("EL PROMEDIO ES " + masa2 );
            System.out.println("");
        } while (vehiculos == 1 || vehiculos == 2 );
    }

}
