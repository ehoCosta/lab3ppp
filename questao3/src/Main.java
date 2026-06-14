// Adapter converte um arquivo de config legado ("chave=valor") para Map<String,String>.

public class Main {
    public static void main(String[] args) {
        String[] linhas = {
                "host=integrarTomcatFoiTriste",
                "porta=8080",
                "usuario=admin"
        };

        ArquivoPropriedadesAntigo arquivoAntigo = new ArquivoPropriedadesAntigo(linhas);
        LeitorConfiguracao leitor = new ArquivoPropriedadesAdapter(arquivoAntigo);
        var configuracoes = leitor.carregarConfiguracoes();

        for (var entrada : configuracoes.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}