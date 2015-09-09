package pt.iefp.tis08;

import java.util.Scanner;

/**
 *
 * @author Pedro
 * @serial 20150909
 */
public class BasicSoma {

   // private static int x;
   // private static int y;

    public static int soma(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Aplicação Soma");
        Scanner in = new Scanner(System.in);
        System.out.println("X=");
        int x = in.nextInt();
        System.out.println("Y=");
        int y = in.nextInt();
        System.out.println("x+y= " + soma(x,y));
    }

}
