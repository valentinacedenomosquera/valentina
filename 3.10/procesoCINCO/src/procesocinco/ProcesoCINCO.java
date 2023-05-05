/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesocinco;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoCINCO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * Determinar la cantidad semanal de dinero que recibirá cada uno de los n
         * obreros
         * de una empresa. Se sabe que cuando las horas que trabajo un obrero exceden de
         * 40, el resto se convierte en horas extras que se pagan al doble de una hora
         * normal,
         * cuando no exceden de 8; cuando las horas extras exceden de 8 se pagan las
         * primeras 8 al doble de lo que se paga por una hora normal y el resto al
         * triple.
         */

        /*
         * cantidad de obreros
         * hallar pago de cada uno
         * si exceden 40 hores son horas extras
         * horas extras valen el doble
         * las primeras hocho horas valen el doble
         * las otras valen el triple
         * 
         */
        Scanner scan = new Scanner(System.in);
        int numobreros, pago, horastrab, horasimple, horasdoble, horastriple, pagohora;

        System.out.println("escriba la cantidad de obreros");
        numobreros = scan.nextInt();
        do {
            pago = 0;
            horasimple = 0;
            horasdoble = 0;
            horastriple = 0;
            System.out.println("escribe las horas trabajadas");
            horastrab = scan.nextInt();
            System.out.println("pago por hora");
            pagohora = scan.nextInt();

            if (horastrab <= 40) {
                horasimple = pagohora * horastrab;
            } else {
                System.out.println("horas extras");
                horastrab = horastrab - 40;

                if (horastrab <= 8) {
                    horasdoble = (horastrab) * (pagohora * 2);
                    horasimple = (40 * pagohora);
                } else {
                    horasimple = (40 * pagohora);
                    horasdoble = 8 * (pagohora * 2);
                    horastriple = (horastrab - 8) * (pagohora * 3);

                }
            }
            pago = horasdoble + horastriple + horasimple;
            System.out.println("el sueldo del obrero es: " + pago);

            numobreros--;
        } while (numobreros > 0);
        scan.close();
    }

}
