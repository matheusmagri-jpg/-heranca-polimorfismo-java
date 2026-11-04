package funcionarios.pagamento;

public class TransferenciaBancaria implements FormaDePagamento {

    private String banco;
    private String agencia;
    private String conta;

    public TransferenciaBancaria(String banco, String agencia, String conta) {
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public String getNome() {
        return "Transferência bancária";
    }

    @Override
    public String pagar(String nomeDoFuncionario, double valor) {
        return "R$ " + valor + " transferidos para " + nomeDoFuncionario
                + " (" + banco + ", agência " + agencia + ", conta " + conta + ")";
    }
}
