package funcionarios.pagamento;

public class Pix implements FormaDePagamento {

    private String chave;

    public Pix(String chave) {
        this.chave = chave;
    }

    @Override
    public String getNome() {
        return "PIX";
    }

    @Override
    public String pagar(String nomeDoFuncionario, double valor) {
        return "R$ " + valor + " enviados por PIX para " + nomeDoFuncionario + " (chave: " + chave + ")";
    }
}
