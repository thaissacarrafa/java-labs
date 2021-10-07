public class Passageiro {
    private String nome;
    private String paisDeOrigem;
    private String paisDestino;
    private Integer diasSintomas;
    private boolean teveSintomas;
    private double temperatura;

    public Passageiro(String nome, String paisDeOrigem, String paisDestino, Integer diasSintomas, boolean teveSintomas, double temperatura) {
        this.nome = nome;
        this.paisDeOrigem = paisDeOrigem;
        this.paisDestino = paisDestino;
        this.diasSintomas = diasSintomas;
        this.teveSintomas = teveSintomas;
        this.temperatura= temperatura;
    }

    public Passageiro(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Integer getDiasSintomas() {
        return diasSintomas;
    }

    public void setDiasSintomas(Integer diasSintomas) {
        this.diasSintomas = diasSintomas;
    }

    public boolean isTeveSintomas() {
        return teveSintomas;
    }

    public void setTeveSintomas(boolean teveSintomas) {
        this.teveSintomas = teveSintomas;
    }

    public double getTemperatura(){
        return  temperatura;

    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    public void verificarFebre(){
        if (temperatura >= 38){
            System.out.println("Você está com febre! Precisamos seguir com a análise!");
        } else {
            System.out.println(" Sua temperatura está normal.");
        }
    }

    public void verificarCovid(){
        if(teveSintomas){
            if(diasSintomas>=15){
                System.out.println("Boa viagem e use a máscara");
            } else{
                System.out.println("Você teve sintomas recentes! Dirija-se para a sala de atendimento médico- Covid");
            }
        } else {
            System.out.println(" Ficamos muito felizes que você não teve sintomas! Mas não deixe de se cuidar!");
        }
    }

}
