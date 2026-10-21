package funcionarios.model;

public class Programador extends Funcionario {

    private String linguagem;

    public Programador(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.10;
    }

    @Override
    public String getCargo() {
        return "Programador";
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " | Linguagem: " + linguagem;
    }
}
