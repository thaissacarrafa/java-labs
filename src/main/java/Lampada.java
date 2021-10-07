public class Lampada {

    private String modelo;
    private String tensao;
    private Integer potencia;
    private boolean ligada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() { // Quando for boolean não é get e sim is
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }


    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() { // método para ligar e desligar
        if (isLigada()) {
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }

    public void alterarEstado() {
    this.ligada = !ligada;
    }


}
