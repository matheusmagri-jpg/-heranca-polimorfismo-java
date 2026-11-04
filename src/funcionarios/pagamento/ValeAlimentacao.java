package funcionarios.pagamento;

public class ValeAlimentacao implements FormaDePagamento {

    private String numeroDoCartao;

    public ValeAlimentacao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public String getNome() {
        return "Vale-alimentação";
    }

    @Override
    public String pagar(String nomeDoFuncionario, double valor) {
        return "R$ " + valor + " creditados no vale-alimentação de " + nomeDoFuncionario
                + " (cartão " + numeroDoCartao + ")";
    }
}
