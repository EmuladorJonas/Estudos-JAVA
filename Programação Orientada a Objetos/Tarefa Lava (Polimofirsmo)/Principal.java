public class Principal {

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Locadora locadora = new Locadora("LoucaDora", "Rua Tal", "8756416545");

/* POSSIVEL APLICAÇÃO DO METODO TRY CATCH!!!!

        try {
            locadora.realizarEmprestimo(cliente, veiculo);
        } catch (CarroNaoDisponivelException e) {
             System.out.println("Não foi possível realizar o empréstimo: " + e.getMessage());
        } catch (ClienteNaoPodeAlugarException e) {
              System.out.println("Não foi possível realizar o empréstimo: " + e.getMessage());
            }

}

*/

    }
}