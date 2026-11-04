package funcionarios.pagamento;

public class Cheque implements FormaDePagamento {

    @Override
    public String getNome() {
        return "Cheque";
    }

    @Override
    public String pagar(String nomeDoFuncionario, double valor) {
        return "Cheque de R$ " + valor + " emitido em nome de " + nomeDoFuncionario;
    }
}
