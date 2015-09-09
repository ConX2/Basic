package pt.iefp.tis08;

import java.util.Scanner;

/**
 *
 * @author Pedro
 * @serial 20150909
 */
public class BasicGreater {

    public static enum CODIGO {

        IGUAL, MAIOR, MENOR, ERRO
    };

    public static CODIGO maior(int x, int y) {
        if (x < y) {
            return CODIGO.MENOR;
        }
        if (x > y) {
            return CODIGO.MAIOR;
        }
        if (x == y) {
            return CODIGO.IGUAL;
        }
        return CODIGO.ERRO;
    }

    public static void main(String[] args) {
        System.out.println("Aplicação Qual é o Maior numero");
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro Numero: ");
        int x = in.nextInt();
        System.out.println("Segundo Numero: ");
        int y = in.nextInt();
        switch (maior(x, y)) {
            case IGUAL:
                System.out.println("x é igual a y");
                break;
            case MAIOR:
                System.out.println("x >y ");
                break;
            case MENOR:
                System.out.println("x <y ");
                break;
            default:
                System.out.println("Erro na comparação");
                break;

        }

    }
}
