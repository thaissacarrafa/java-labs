package Usuario;

public class ExercicioUsuario {

    public static void main(String[] args) {

        Usuario mineiro = new Usuario("Pedro", "Carlos",45);
        mineiro.setAnoDeNascimento(1980);
        mineiro.setPossuiPicpay(true);
        mineiro.setPossuiPicpay(true);


        Usuario pernambucano = new Usuario();
        pernambucano.setIdade(45);
        pernambucano.setPossuiPicpay(false);
        pernambucano.setSobrenome("Quadros");

        System.out.println(testeExercicio());
    }



    private static String testeExercicio () {
        return "Está funcionando, não pare de treinar!";
    }




}


// Criar um método que recebe dois inteiro e retorna um inteiro somado.



/* Criar um objeto pessoa que tenha como atributo um nome e um sobrenome (sem anotações), com getter e setters e um construtor
com todos os parâmetros

Criar um método que receba duas Strings ( nome e sobrenome) e retornará uma pessoa.
 */
