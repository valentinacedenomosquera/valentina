
package pkg3.pkg11.pkg3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Suponga que tiene usted una tienda y desea registrar las ventas en una
         * computadora.
         * Diseñe un pseudocódigo que lea por cada cliente, el monto total de
         * su compra. Al final del día escriba la cantidad total de las ventas y el
         * número de clientes atendidos
         */
        Scanner scan = new Scanner(System.in);
        int clientes = 0, ventas = 0, monto, opcion = 0;
        while (opcion != 2) {
            System.out.println("menu:");
            System.out.println("1. Ingresar cliente");
            System.out.println("2. Terminar programa.");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    clientes++;
                    System.out.println("Ingrese el monto del cliente.");
                    monto = scan.nextInt();
                    ventas = ventas + monto;
                    break;
                case 2:
                    System.out.println("El total de ventas del dia es: " + ventas);
                    System.out.println("El total de clientes del dia es: " + clientes);
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        scan.close();
    }

}
