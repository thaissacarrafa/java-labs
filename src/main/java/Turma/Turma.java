package Turma;

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


    // m??todo para somar a nota de tr??s mat??rias e ver se ele foi aprovado

    public void verificarAprova????o() {
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media, i, contAluno = 0;

        for (i = 0; i < 3; i++) {

            contAluno++;
            // recebe a 1?? nota
            System.out.println("Aluno " + contAluno + ", digite sua 1?? nota");
            nota1 = ent.nextInt();


            // recebe a 2?? nota
            System.out.println("Aluno " + contAluno + ", digite sua 2?? nota");
            nota2 = ent.nextInt();

            // recebe a 3?? nota
            System.out.println("Aluno " + contAluno + ", digite sua 3?? nota");
            nota3 = ent.nextInt();

            // calcula a m??dia
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A m??dia do aluno " + contAluno + " ?? " + media);

            // mostra a nota do aluno
            if ((media < 7) && (media >= 1)) {
                System.out.println("Voc?? foi reprovado");
            } else if (media <= 7) {
                System.out.println("Voc?? foi aprovado");
            }


        }
    }

}


