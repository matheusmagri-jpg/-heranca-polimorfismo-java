package funcionarios.model;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

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

    public double getSalario() {
        return salario;
    }

    public abstract double getBonificacao();

    public abstract String getCargo();

    public String exibirDados() {
        return getCargo() + " | " + nome + " | CPF: " + cpf
                + " | Salário: R$ " + salario
                + " | Bonificação: R$ " + getBonificacao();
    }

    public boolean autentica(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
