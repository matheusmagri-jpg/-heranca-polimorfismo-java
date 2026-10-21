package funcionarios.service;

import funcionarios.model.Funcionario;

public class ControleDeBonificacoes {

    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        totalDeBonificacoes = totalDeBonificacoes + f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
}
