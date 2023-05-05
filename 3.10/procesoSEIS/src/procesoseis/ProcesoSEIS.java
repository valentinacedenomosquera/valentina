/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesoseis;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoSEIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * En una granja se requiere saber alguna información para determinar el precio
         * de
         * venta por cada kilo de huevo. Es importante determinar el promedio de calidad
         * de
         * las n gallinas que hay en la granja. La calidad de cada gallina se obtiene
         * según la
         * fórmula:
         * Calidad = peso de la gallina * altura de la gallina
         * Número de huevos que pone
         * - Finalmente para fijar el precio del kilo de huevo, se toma como base la
         * siguiente tabla:
         * PRECIO TOTAL DE CALIDAD PESO POR KILO DE HUEVO
         * Mayor o igual que 15 1.2 * promedio de calidad
         * Mayor que 8 y menor que 15 1.00 * promedio de calidad
         * Menor o igual que 8 0.80 * promedio de calidad
         *
         */
        Scanner scan = new Scanner(System.in);
        int numgallinas, i, precio = 0;
        double calidad, pesogallina, alturagallina, numhuevos, caltotal = 0, promedioc;
        i = 1;

        System.out.println("escriba el numero de gallinas");
        numgallinas = scan.nextInt();

        do {

            System.out.println("gallina " + (i++));

            System.out.println("escriba el peso de la gallina");
            pesogallina = scan.nextDouble();
            System.out.println("escriba la altura de la gallina");
            alturagallina = scan.nextDouble();
            System.out.println("escribe el numero de huevos que pone");
            numhuevos = scan.nextDouble();

            calidad = (pesogallina * alturagallina) / numhuevos;

            System.out.println("la calidad de la gallina sera: " + calidad);

            caltotal = caltotal + calidad;
            numgallinas--;

        } while (numgallinas != 0);

        promedioc = caltotal / i;
        if (promedioc >= 15) {
            precio = (int) (1.2 * promedioc);
        } else if (promedioc > 8 & promedioc < 15) {
            precio = (int) (1 * promedioc);
        } else if (promedioc <= 8) {
            precio = (int) (0.8 * promedioc);
        }

        System.out.println("el precio por kilo de huevos es de: " + precio);

        scan.close();
    }

}
