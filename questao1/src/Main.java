import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ave> aves = new ArrayList<>();
        aves.add(new PatoAdapter(new PatoDomestico()));
        aves.add(new PavaoAdapter(new PavaoAzul()));

        for (Ave ave : aves) {
            ave.voar();
            ave.emitirSom();
            System.out.println("- - - - - - -");
        }
    }
}