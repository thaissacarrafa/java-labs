public class ExercicioPassageiro {
    public static void main(String[] args) {

        Passageiro passageiroPaulista = new Passageiro();
        passageiroPaulista.setNome("Aramizu");
        passageiroPaulista.setPaisDeOrigem("Brasil-SP");
        passageiroPaulista.setPaisDestino("Brasil-Vix");
        passageiroPaulista.setTeveSintomas(false);
        passageiroPaulista.setTemperatura(36);


        Passageiro passageiroMineiro = new Passageiro();
        passageiroMineiro.setNome("Joãozinho");
        passageiroMineiro.setPaisDeOrigem("EUA");
        passageiroMineiro.setPaisDestino("Brasil");
        passageiroMineiro.setTeveSintomas(true);
        passageiroMineiro.setDiasSintomas(2);
        passageiroMineiro.setTemperatura(39.5);


        System.out.println(" Dados do passageiro Mineiro");
        passageiroMineiro.verificarFebre();
        passageiroMineiro.verificarCovid();
        System.out.println("___________________________________________");
        System.out.println(" Dados do passageiro Paulista");
        passageiroPaulista.verificarFebre();
        passageiroPaulista.verificarCovid();


    }


}
