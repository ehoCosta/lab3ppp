public class RepositorioDocumentosProxy implements RepositorioDocumentos {

    /*
        proxy: implementa a mesma interface do obj base
        o cliente nunca acessa o doc real, ele passa pelo proxy e o proxy controla o acesso deixando so adm ver
     */

    private RepositorioDocumentosReal repositorioReal;
    private Usuario usuario;

    public RepositorioDocumentosProxy(Usuario usuario) {
        this.usuario = usuario; // obj real so eh instanciado quando necessario
        this.repositorioReal = new RepositorioDocumentosReal();
    }

    @Override
    public void exibirDocumento(String nomeDocumento) {
        if (usuario.isAdministrador()) {
            System.out.println("[PROXY] Acesso permitido para " + usuario.getNome() + ".");
            repositorioReal.exibirDocumento(nomeDocumento);
        } else {
            System.out.println("[PROXY] Acesso negado para " + usuario.getNome());
        }
    }
}