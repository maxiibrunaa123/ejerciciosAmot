package Guia02;

import java.util.Scanner;

public class Ejercicio05 {
    /*
    * Escriba un programa en el cual se ingrese un valor límite positivo,
    *  y a continuación solicite números al usuario hasta que la suma de los
    * números introducidos supere el límite inicial.
     */
        public static void ejercicio5(){
            int n , aux,max;
            Scanner scanner = new Scanner(System.in);
            aux = 0;
            max=0;
            System.out.println("Ingrese numero limite");
            max = scanner.nextInt();

            while (aux < max){
                System.out.println("Ingrese numero para sumar.");
                aux=aux+scanner.nextInt();
            }
        }
}
