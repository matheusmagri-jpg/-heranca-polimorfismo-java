package funcionarios.model;

// Contrato de quem recebe salário e bonificação.
public interface Pagavel {

    double getSalario();

    double getBonificacao();

    String receberSalario();

    String receberBonificacao();
}
