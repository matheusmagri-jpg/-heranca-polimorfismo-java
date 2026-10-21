package funcionarios.model;

public class Estagiario extends Funcionario {

    private String instituicaoDeEnsino;

    public Estagiario(String nome, String cpf, double salario, String instituicaoDeEnsino) {
        super(nome, cpf, salario);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    @Override
    public double getBonificacao() {
        return 200.0;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " | Instituição: " + instituicaoDeEnsino;
    }
}
