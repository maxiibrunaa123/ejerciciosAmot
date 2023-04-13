package Guia01;

import java.util.Scanner;

public class Ejercicio06 {
    public static void ejercicio6(){
 /*
* Realizar un programa que pida dos números enteros positivos por teclado y
* muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar
* el resultado por pantalla y luego volver al menú.
* El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
* si el usuario selecciona la opción 5, en vez de salir del programa directamente,
* se debe mostrar el siguiente mensaje de confirmación:
* ¿Está seguro que desea salir del programa (S/N)?
*  Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
        Scanner scanner = new Scanner(System.in);
        int n1, n2, opt;
        String exit = "";
        System.out.println("Ingrese numero");
        n1 = scanner.nextInt();
        System.out.println("Ingrese numero");
        n2 = scanner.nextInt();
        do {
            menu();
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("La suma de " + n1 + "+" + n2 + " es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta de " + n1 + "-" + n2 + " es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de " + n1 + "*" + n2 + " es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La division de " + n1 + "/" + n2 + " es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Seguro quiere salir ? Ingrese S/N");
                    exit = scanner.next();
                    if (exit.equals("s")) {break;}else if(exit.equals("n")) {continue;}
            }
        }while( !(exit.equals("s")));
    }

    private static void menu() {
        System.out.println("MENU");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        System.out.println("Eleija opcion:");
    }
}
