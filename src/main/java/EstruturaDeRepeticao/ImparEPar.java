package EstruturaDeRepeticao;


import java.util.Scanner;

/* Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quanitdade de números impares
 */
public class ImparEPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int pares = 0;
        int impares = 0;
        int contador = 0;


        System.out.println("Informe um número: ");
        numero = scan.nextInt();

        do {
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0)
             pares++;
            else
            impares++;
            
            contador++;
        }

            while (contador < numero);

            System.out.println("Você digitou: " + pares + "números pares");
            System.out.println("Você digitou: " + impares + "números impares");



    }
}

