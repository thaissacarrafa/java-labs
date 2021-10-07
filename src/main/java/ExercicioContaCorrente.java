public class ExercicioContaCorrente {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setBanco("Itaú");
        contaCorrente.setNumeroConta(1234);
        contaCorrente.setSaldo(100);
        contaCorrente.setStatus(true);
        contaCorrente.setChequeEspecial(true);
        contaCorrente.setSaldoChequeEspecial(0);
        contaCorrente.setLimiteDoChequeEspecial(100);
        contaCorrente.setNomeCliente("Cesar");

        System.out.println(" Boa tarde " + contaCorrente.getNomeCliente() + ". Você acessou sua conta " + contaCorrente.getNumeroConta());
        contaCorrente.consultarSaldo();
        contaCorrente.consultaLimite();
        contaCorrente.valorDoChequeEspecial();

        System.out.println("____________________________________________________________");
        contaCorrente.sacarDinheiro(200);
        contaCorrente.valorDoChequeEspecial();
        contaCorrente.consultarSaldo();
        contaCorrente.depositarDinheiro(50);
        contaCorrente.consultarSaldo();
        contaCorrente.valorDoChequeEspecial();

        System.out.println("____________________________________________________________");
        System.out.println(" Volte sempre a fazer transações conosco. Abraços Banco " + contaCorrente.getBanco());
    }
}
