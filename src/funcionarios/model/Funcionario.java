package funcionarios.model;

import funcionarios.pagamento.FormaDePagamento;

public abstract class Funcionario implements Pagavel {

    private String nome;
    private String cpf;
    private double salario;
    private FormaDePagamento formaDoSalario;
    private FormaDePagamento formaDaBonificacao;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public abstract double getBonificacao();

    public abstract String getCargo();

    // O funcionário escolhe como quer receber o salário
    public void escolherFormaDoSalario(FormaDePagamento forma) {
        this.formaDoSalario = forma;
    }

    // O funcionário escolhe como quer receber a bonificação
    public void escolherFormaDaBonificacao(FormaDePagamento forma) {
        this.formaDaBonificacao = forma;
    }

    public FormaDePagamento getFormaDoSalario() {
        return formaDoSalario;
    }

    public FormaDePagamento getFormaDaBonificacao() {
        return formaDaBonificacao;
    }

    @Override
    public String receberSalario() {
        if (formaDoSalario == null) {
            return "Salário: " + nome + " ainda não escolheu como receber";
        }
        return "Salário (" + formaDoSalario.getNome() + "): " + formaDoSalario.pagar(nome, salario);
    }

    @Override
    public String receberBonificacao() {
        if (formaDaBonificacao == null) {
            return "Bonificação: " + nome + " ainda não escolheu como receber";
        }
        return "Bonificação (" + formaDaBonificacao.getNome() + "): "
                + formaDaBonificacao.pagar(nome, getBonificacao());
    }

    public String exibirDados() {
        return getCargo() + " | " + nome + " | CPF: " + cpf
                + " | Salário: R$ " + salario
                + " | Bonificação: R$ " + getBonificacao();
    }
}
