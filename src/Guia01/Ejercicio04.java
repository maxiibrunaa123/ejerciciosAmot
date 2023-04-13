package Guia01;

import java.util.Scanner;

public class Ejercicio04 {
    public static void ejercicio4(){
        /*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una
         ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un
          mensaje por pantalla que diga “CORRECTO”, en caso contrario,
          se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
         */
        String frase= null;
        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("Ingrese palabra o frase:");
            frase= scanner.nextLine();
            System.out.println(frase.substring(0));
            if((frase.substring(0)).equals("a")){
                System.out.println("CORRECTO");
            }else {
                System.out.println("INCORRECTO");
            }
        }catch(Exception e){
            System.out.println("Error:" + e.getMessage());

        }


    }
}
