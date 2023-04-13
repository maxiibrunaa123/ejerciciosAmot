package Guia02;

import java.util.Scanner;

public class Ejercicio07 {
    public static void ejercicio7(){

        String msj;
        int correct=0;
        int incorrect=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese mensaje.");
            msj = scanner.nextLine();
            if (msj.equals("&&&&&")){
                break;
            }else{
                if ((msj.length() == 5 )&&(msj.startsWith("x")) && (msj.endsWith("o"))){
                    correct++;
                }else {
                    incorrect++;
                }
            }
        }while(!msj.equals("&&&&&"));

        System.out.println("La cantidad de mensajes correctos es:" + correct +
                            " y los incorrectos son" + incorrect);
    }
}
