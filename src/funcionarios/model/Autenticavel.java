package funcionarios.model;

// Contrato de quem pode entrar no sistema com senha.
public interface Autenticavel {

    boolean autentica(int senha);
}
