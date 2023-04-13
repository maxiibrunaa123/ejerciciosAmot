package Guia01.Extras;

import java.util.Calendar;
import java.util.Scanner;

public class Extra1 {
    /*
    Dado un tiempo en minutos, calcular su equivalente en días y horas.
    Por ejemplo, si el usuario ingresa 1600 minutos,
     el sistema debe calcular su equivalente: 1 día, 2 horas.
     */

    public static void extra1() {
        Scanner scanner = new Scanner(System.in);
        int min, day, hour;


        while (true) {
            try {
                System.out.println("Ingrese minutos");
                min = scanner.nextInt();
                day = min / 1440;
                hour = (min % 1440) / 60;
                System.out.println(day + " dias, " + "horas " + hour);
                break;
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
                scanner.next();
            }
        }
    }
}
