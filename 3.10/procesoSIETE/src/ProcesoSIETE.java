import java.util.Scanner;

public class ProcesoSIETE {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numdip, opinion, numtotal;
        double numfavor = 0.0, numcontra = 0.0, numnoop = 0.0;

        System.out.println("escriba a cuantos diputados se les pregunta");
        numdip = scan.nextInt();
        numtotal = numdip;
        do {
            System.out.println("");
            System.out.println("***");
            System.out.println("sabiendo que usted es uno de los diputados a los que se les hizo la pregunta");
            System.out.println("referente al tratado de libre comercio");
            System.out.println("1. si esta deacuerdo");
            System.out.println("2. si no esta deacuerdo");
            System.out.println("3. si no opnia");
            opinion = scan.nextInt();
            switch (opinion) {
                case 1:
                    numfavor = numfavor + 1;
                    break;
                case 2:
                    numcontra = numcontra + 1;
                    break;
                case 3:
                    numnoop = numnoop + 1;
                    break;
            }

            numdip--;
        } while (numdip != 0);

        numfavor = (numfavor * 100) / numtotal;
        numcontra = (numcontra * 100) / numtotal;
        numnoop = (numnoop * 100) / numtotal;

        System.out.println("el proncentaje de los diputados que estubieron a favor: " + numfavor);
        System.out.println("el proncentaje de los diputados que estubieron en contra: " + numcontra);
        System.out.println("el proncentaje de los diputados que no opinaron: " + numnoop);

        scan.close();
    }
}
