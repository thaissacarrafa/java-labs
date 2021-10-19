package EstruturaDeRepeticao;


import java.util.Scanner;

/* Pedir uma nota entre 0 e 10 e se for inválido monstra a mensagem e pede a nota até que tenha um válido

 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida, digite nova nota");
            nota = scan.nextInt();
        }
        System.out.println(" Nota válida! Obrigada!");
    }
}