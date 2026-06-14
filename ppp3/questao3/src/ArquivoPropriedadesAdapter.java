import java.util.HashMap;
import java.util.Map;

public class ArquivoPropriedadesAdapter implements LeitorConfiguracao {


    private ArquivoPropriedadesAntigo arquivoAntigo;
    public ArquivoPropriedadesAdapter(ArquivoPropriedadesAntigo arquivoAntigo) {
        this.arquivoAntigo = arquivoAntigo;
    }

    @Override
    public Map<String, String> carregarConfiguracoes() {
        Map<String, String> configuracoes = new HashMap<>();
        for (String linha : arquivoAntigo.lerLinhas()) {
            String[] partes = linha.split("=", 2);
            if (partes.length == 2) {
                configuracoes.put(partes[0].trim(), partes[1].trim());
            }
        }
        return configuracoes;
    }
}