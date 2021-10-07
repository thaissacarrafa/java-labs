import java.util.Scanner;

public class Turma { // atributos
    private String nome;
    private Integer matricula;
    private String curso;
    private String portugues;
    private String matematica;
    private String literatura;
    private double notaPortugues;
    private double notaMatematica;
    private double notaLiteratura;


    // Construtores

    public Turma(String nome, Integer matricula, String curso, String portugues, String matematica, String literatura, double notaPortugues, double notaMatematica, double notaLiteratura) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.portugues = portugues;
        this.matematica = matematica;
        this.literatura = literatura;
        this.notaPortugues = notaPortugues;
        this.notaMatematica = notaMatematica;
        this.notaLiteratura = notaLiteratura;
    }


    // Getter e Setters

    public Turma() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getMatematica() {
        return matematica;
    }

    public void setMatematica(String matematica) {
        this.matematica = matematica;
    }

    public String getLiteratura() {
        return literatura;
    }

    public void setLiteratura(String literatura) {
        this.literatura = literatura;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaLiteratura() {
        return notaLiteratura;
    }

    public void setNotaLiteratura(double notaLiteratura) {
        this.notaLiteratura = notaLiteratura;
    }


    // método para somar a nota de três matérias e ver se ele foi aprovado

    public void verificarAprovação() {
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media, i, contAluno = 0;

        for (i = 0; i < 3; i++) {

            contAluno++;
            // recebe a 1º nota
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();

            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();

            // recebe a 3º nota
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();

            // calcula a média
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + contAluno + " é " + media);

            // mostra a nota do aluno
            if ((media < 7) && (media >= 1)) {
                System.out.println("Você foi reprovado");
            } else if (media <= 7) {
                System.out.println("Você foi aprovado");
            }


        }
    }
}


