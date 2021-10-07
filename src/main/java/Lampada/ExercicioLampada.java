package Lampada;

public class ExercicioLampada {

    public static void main(String[] args) {


        Lampada lampada = new Lampada();// Classe + nome da classe em minúsculo = new + instanciar o objeto
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.alterarEstado();
        lampada.mostrarEstado();
    }
}