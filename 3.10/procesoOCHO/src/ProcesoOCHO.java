import java.util.Scanner;

public class ProcesoOCHO {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int precio, etiqueta, total = 0;
        do {
            System.out.println("");
            System.out.println("***");
            System.out.println("escriba el presio de su compra");
            precio = scan.nextInt();

            System.out.println("escriba si la etiqueta es roja o no");
            System.out.println("1.si la etiqueta es roja");
            System.out.println("2. si no lo es");
            System.out.println("3. si no desea comprar mas");
            etiqueta = scan.nextInt();
            if (etiqueta == 1) {
                precio = (int) (precio * 0.20);
                System.out.println("el valor de su compra con el descuento seria: " + precio);
            }

            total = total + precio;
        } while (etiqueta != 3);
        System.out.println("el total a pagar seria");
        System.out.println(total);
        scan.close();

    }
}
