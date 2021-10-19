package EstruturaDeRepeticao;


/* Faça um programa que leia 5 números
e informe o maior número e a média desses números
 */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int contador = 0;
        int maior = 0;


        do{
            System.out.println("Informe um número: ");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;

            contador++ ;

        } while(contador < 5);

        System.out.println("Maior número é: " + maior);
        System.out.println("Média: " + (soma/5));

        }
    }
