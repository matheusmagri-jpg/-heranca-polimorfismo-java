package funcionarios.app;

import funcionarios.model.Diretor;
import funcionarios.model.Estagiario;
import funcionarios.model.Funcionario;
import funcionarios.model.Gerente;
import funcionarios.model.Programador;
import funcionarios.service.ControleDeBonificacoes;
import java.util.ArrayList;

public class ProgramaFuncionario {

    public static void main(String[] args) {

        Funcionario programador = new Programador("Tony Stark", "119.741.906.33", 4000, "Java");
        Funcionario estagiario = new Estagiario("Pateta da Disney", "222.222.222-22", 1500, "CEFET");
        Gerente gerente = new Gerente("Matheus Genio Filatonpro Bilionario", "333.333.333-33", 6000, 1234);
        Funcionario diretor = new Diretor("Bruce Wayne", "444.444.444-44", 10000, 9999);

        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(programador);
        lista.add(estagiario);
        lista.add(gerente);
        lista.add(diretor);

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        System.out.println("===== FUNCIONÁRIOS =====");
        for (Funcionario f : lista) {
            System.out.println(f.exibirDados());
            controle.registra(f);
            System.out.println("------------------------------");
        }

        System.out.println("Total de bonificações: R$ " + controle.getTotalDeBonificacoes());

        System.out.println();
        System.out.println("===== LOGIN =====");

        if (gerente.autentica(1234)) {
            System.out.println("Gerente " + gerente.getNome() + ": acesso permitido");
        } else {
            System.out.println("Gerente " + gerente.getNome() + ": acesso negado");
        }

        if (diretor.autentica(1234)) {
            System.out.println("Diretor " + diretor.getNome() + ": acesso permitido");
        } else {
            System.out.println("Diretor " + diretor.getNome() + ": acesso negado");
        }
    }
}
