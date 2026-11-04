package funcionarios.service;

import funcionarios.model.Pagavel;

public class ControleDeBonificacoes {

    private double totalDeBonificacoes = 0;

    // Aceita qualquer objeto que implemente Pagavel
    public void registra(Pagavel p) {
        totalDeBonificacoes = totalDeBonificacoes + p.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }
}
