package EstruturaDeRepeticao;

import java.util.Scanner;

/* Cálculo de fatorial de números inteiros

 */
public class Fatorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("De qual número você deseja o fatorial? ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");

        for( int i = fatorial; i >=1; i-- ){
        multiplicacao = multiplicacao * i;


    }
        System.out.println(multiplicacao);
    }
}
