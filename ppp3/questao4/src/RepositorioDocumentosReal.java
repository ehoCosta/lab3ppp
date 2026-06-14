public class RepositorioDocumentosReal implements RepositorioDocumentos {

    /*
        obj base é acesso aos docs
        os clientes nunca interagem diretamente com essa classe
     */
    @Override
    public void exibirDocumento(String nomeDocumento) {
        System.out.println("Exibindo documento confidencial: " + nomeDocumento);
    }
}