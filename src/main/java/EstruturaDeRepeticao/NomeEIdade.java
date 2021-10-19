package EstruturaDeRepeticao;

import java.util.Scanner;


/* Ler dois valores, sendo um o nome do aluno e o outro é a idade.
( Pare o programa inserindo 0 no nome do aluno)
 */
public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

        System.out.println("Acabou!");
    }
}