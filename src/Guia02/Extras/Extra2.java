package Guia02.Extras;

public class Extra2 {
    /*
    B tome el valor de C, C tome el valor de A, A tome
    el valor de D y D tome el valor de B.
     */
    public static void extra2(){
        int A,B,C,D;
        int aux;
        A=1;
        B=2;
        C=3;
        D=4;
        System.out.println("A: " +A+" B: " + B + " C: " + C + " D: " + D );
        aux = B;
        B = C;
        C = A;
        A = D;
        D=aux;
        System.out.println("A: " +A+" B: " + B + " C: " + C + " D: " + D );
    }
}
