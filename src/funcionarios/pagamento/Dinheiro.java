package funcionarios.pagamento;

public class Dinheiro implements FormaDePagamento {

    @Override
    public String getNome() {
        return "Dinheiro";
    }

    @Override
    public String pagar(String nomeDoFuncionario, double valor) {
        return "R$ " + valor + " entregues em dinheiro para " + nomeDoFuncionario;
    }
}
