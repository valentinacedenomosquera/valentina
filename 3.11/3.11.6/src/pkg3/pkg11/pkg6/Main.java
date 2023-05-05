
package pkg3.pkg11.pkg6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int censo = 0;
        while (censo != 5) {
            censo++;
            System.out.println("Numero de censo: " + censo);
            System.out.println("Sexo:");
            System.out.println("1. Masculino.");
            System.out.println("2. Femenino.");
            int sexo = scan.nextInt();
            System.out.println("Ingrese la edad.");
            int edad = scan.nextInt();
            System.out.println("Estado civil:");
            System.out.println("1. Soltero.");
            System.out.println("2. Casado.");
            System.out.println("3. Viudo.");
            System.out.println("4. Divorciado.");
            int estado = scan.nextInt();
            if (sexo == 2 & estado == 1 & edad > 15 & edad < 22) {
                System.out.println("El numero de censo de la joven soltera entre 16 y 21 es: " + censo);
            }
        }
        scan.close();
    }
}
