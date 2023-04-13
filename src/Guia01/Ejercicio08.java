package Guia01;

import java.util.Scanner;

public class Ejercicio08 {
    public static void ejercicio8() {
//        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Ingrese largo de lados");
        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
    }

