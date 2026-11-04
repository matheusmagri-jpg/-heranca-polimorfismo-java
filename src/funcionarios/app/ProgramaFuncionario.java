package funcionarios.app;

import funcionarios.model.Autenticavel;
import funcionarios.model.Diretor;
import funcionarios.model.Estagiario;
import funcionarios.model.Funcionario;
import funcionarios.model.Gerente;
import funcionarios.model.Programador;
import funcionarios.pagamento.Cheque;
import funcionarios.pagamento.Dinheiro;
import funcionarios.pagamento.Pix;
import funcionarios.pagamento.TransferenciaBancaria;
import funcionarios.pagamento.ValeAlimentacao;
import funcionarios.service.ControleDeBonificacoes;
import java.util.ArrayList;

public class ProgramaFuncionario {

    public static void main(String[] args) {

        Funcionario programador = new Programador("Tony Stark", "119.741.906.33", 4000, "Java");
        Funcionario estagiario = new Estagiario("Pateta da Disney", "222.222.222-22", 1500, "CEFET");
        Gerente gerente = new Gerente("Matheus Genio Filatonpro Bilionario", "333.333.333-33", 6000, 1234);
        Gerente diretor = new Diretor("Bruce Wayne", "444.444.444-44", 10000, 9999);

        // Cada funcionário escolhe como quer receber o salário e a bonificação
        programador.escolherFormaDoSalario(new Pix("tony@stark.com"));
        programador.escolherFormaDaBonificacao(new ValeAlimentacao("5555-1111"));

        estagiario.escolherFormaDoSalario(new TransferenciaBancaria("Banco do Brasil", "0001", "12345-6"));
        estagiario.escolherFormaDaBonificacao(new Dinheiro());

        gerente.escolherFormaDoSalario(new TransferenciaBancaria("Itaú", "0420", "98765-4"));
        gerente.escolherFormaDaBonificacao(new Pix("333.333.333-33"));

        diretor.escolherFormaDoSalario(new Cheque());
        diretor.escolherFormaDaBonificacao(new Pix("bruce@wayne.com"));

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
        System.out.println("===== PAGAMENTOS =====");
        for (Funcionario f : lista) {
            System.out.println(f.getCargo() + " " + f.getNome());
            System.out.println("  " + f.receberSalario());
            System.out.println("  " + f.receberBonificacao());
        }

        System.out.println();
        System.out.println("===== LOGIN =====");

        // Só quem implementa Autenticavel entra nesta lista
        ArrayList<Autenticavel> comAcesso = new ArrayList<>();
        comAcesso.add(gerente);
        comAcesso.add(diretor);

        for (Autenticavel a : comAcesso) {
            Funcionario f = (Funcionario) a;
            if (a.autentica(1234)) {
                System.out.println(f.getCargo() + " " + f.getNome() + ": acesso permitido");
            } else {
                System.out.println(f.getCargo() + " " + f.getNome() + ": acesso negado");
            }
        }
    }
}
