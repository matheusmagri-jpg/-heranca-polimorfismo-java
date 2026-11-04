package funcionarios.model;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}