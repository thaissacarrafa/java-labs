package ContaCorrente;

public class ContaCorrente {

    private String nomeCliente;
    private String banco;
    private double saldo;
    private Boolean status;
    private Integer numeroConta;
    private boolean chequeEspecial;
    private double chequeEspecialUsado;
    private double limiteDoChequeEspecial;

    public ContaCorrente(String nomeCliente, String banco, double saldo, Boolean status, Integer numeroConta, boolean chequeEspecial, double chequeEspecialUsado, double limiteDoChequeEspecial) {
        this.nomeCliente = nomeCliente;
        this.banco = banco;
        this.saldo = saldo;
        this.status = status;
        this.numeroConta = numeroConta;
        this.chequeEspecial = chequeEspecial;
        this.chequeEspecialUsado = chequeEspecialUsado;
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }

    public ContaCorrente() {

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean isChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(boolean chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimiteDoChequeEspecial() {
        return limiteDoChequeEspecial;
    }

    public void setLimiteDoChequeEspecial(double limiteDoChequeEspecial) {
        this.limiteDoChequeEspecial = limiteDoChequeEspecial;
    }

    public double getSaldoChequeEspecial() {
        return chequeEspecialUsado;
    }

    public void setSaldoChequeEspecial(double saldoChequeEspecial) {
        this.chequeEspecialUsado = saldoChequeEspecial;
    }

    public void consultarSaldo() {
        System.out.println("O saldo da sua conta é " + saldo);
    }

    public void consultaLimite() {
        System.out.println("O valor de cheque especial disponível é de " + limiteDoChequeEspecial);
    }

    public void valorDoChequeEspecial() {
        if (chequeEspecialUsado > 0) {
            System.out.println("Você está usando o saldo de cheque especial no valor de " + chequeEspecialUsado + " e ainda possui um limite de " + (limiteDoChequeEspecial - chequeEspecialUsado));
        } else {
            System.out.println("Você não está usando o limite do seu cheque especial");

        }
    }

    public void depositarDinheiro(double deposito) {
        if (chequeEspecialUsado == 0) {
            saldo += deposito;
            System.out.println(" Depósito de " + deposito + " realizado com sucesso");
        } else if(chequeEspecialUsado > 0) {
            if(deposito>chequeEspecialUsado){
                double valorDepositoChequeMaior = deposito - chequeEspecialUsado;
                double restanteDeposito = (deposito - valorDepositoChequeMaior);

                saldo += valorDepositoChequeMaior;
                chequeEspecialUsado = 0;

            } else if( deposito<chequeEspecialUsado){
                double restanteDepositoMenor = chequeEspecialUsado - deposito;

                chequeEspecialUsado -= deposito;
            }


        }
    }


    public double saldoMaisCheque() {
        return saldo + (limiteDoChequeEspecial - chequeEspecialUsado);
    }

    public void sacarDinheiro(double valorDoSaque) {
        double saldoTotal = saldoMaisCheque();
        if (valorDoSaque <= saldoTotal) {
            if (valorDoSaque <= saldo) {
                saldo -= valorDoSaque;
                System.out.println("Saque realizado com sucesso, no valor de R$ " + valorDoSaque);
            } else {
                double restante = valorDoSaque - saldo;
                saldo = 0;
                chequeEspecialUsado += restante;
                System.out.println("Saque realizado com sucesso " + valorDoSaque);

            }

        } else {
            System.out.println(" Você não possui saldo disponível");
        }
    }
}


