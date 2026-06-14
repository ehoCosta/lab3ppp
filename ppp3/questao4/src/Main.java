// controlar o acesso dos docs confidenciais, só adm pode acessar

public class Main {
    public static void main(String[] args) {

        //o cliente interage so com a interface e nao sabe se tá se comunicando com o proxy ou obj real

        Usuario admin = new Usuario("Ana", true);
        Usuario funcionario = new Usuario("Carlos", false);

        RepositorioDocumentos repositorioAdmin = new RepositorioDocumentosProxy(admin);
        RepositorioDocumentos repositorioFuncionario = new RepositorioDocumentosProxy(funcionario);

        System.out.println("Tentativa pelo administrador:");
        repositorioAdmin.exibirDocumento("Relatorio_Financeiro.pdf");

        System.out.println("\nTentativa pelo funcionário:");
        repositorioFuncionario.exibirDocumento("Relatorio_Financeiro.pdf");
    }
}