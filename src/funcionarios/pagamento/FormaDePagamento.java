package funcionarios.pagamento;

// Contrato que toda modalidade de pagamento precisa cumprir.
// Quem implementa (implements) esta interface é obrigado a escrever os dois métodos.
public interface FormaDePagamento {

    String getNome();

    String pagar(String nomeDoFuncionario, double valor);
}
