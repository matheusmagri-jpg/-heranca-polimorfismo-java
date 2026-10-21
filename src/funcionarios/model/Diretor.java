package funcionarios.model;

public class Diretor extends Gerente {

    public Diretor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario, senha);
    }

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }

    @Override
    public String getCargo() {
        return "Diretor";
    }
}
