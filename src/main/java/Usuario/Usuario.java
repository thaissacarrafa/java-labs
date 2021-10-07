package Usuario;

public class Usuario {
   private String nome;
   private String sobrenome;
   private Integer idade;
   private Integer anoDeNascimento;
   private  Boolean possuiPicpay;
   private Integer saldo1;
   private  Integer saldo2;
   private Integer  saldo3;
   private Integer  saldo4;

   // Com Construtores @AllArgsConstructor

   Usuario(String nome, String sobrenome, Integer idade){ //construtor
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.idade= idade;
   }

   // Sem construtores @NoArgsConstructor

   Usuario(){

   }


   public String getNome(){
       return this.nome;
   }

   public void setNome (String nome){
       this.nome = nome;
   }

   public String getSobrenome() {
       return this.sobrenome;
   }

   public void setSobrenome (String sobrenome) {
       this.sobrenome = sobrenome;
   }

   public Integer getAnoDeNascimento() {
       return this.anoDeNascimento;
   }

   public void setAnoDeNascimento (Integer anoDeNascimento){
       this.anoDeNascimento = anoDeNascimento;
   }

   public  Boolean getPossuiPicpay() {
       return  this.possuiPicpay;
   }

   public void setPossuiPicpay (Boolean possuiPicpay) {
       this.possuiPicpay = possuiPicpay;
   }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getSaldo1() {
        return saldo1;
    }

    public void setSaldo1(Integer saldo1) {
        this.saldo1 = saldo1;
    }

    public Integer getSaldo2() {
        return saldo2;
    }

    public void setSaldo2(Integer saldo2) {
        this.saldo2 = saldo2;
    }

    public Integer getSaldo3() {
        return saldo3;
    }

    public void setSaldo3(Integer saldo3) {
        this.saldo3 = saldo3;
    }

    public Integer getSaldo4() {
        return saldo4;
    }

    public void setSaldo4(Integer saldo4) {
        this.saldo4 = saldo4;
    }
}



