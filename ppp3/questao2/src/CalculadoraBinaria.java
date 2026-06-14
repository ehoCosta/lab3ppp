public class CalculadoraBinaria {

    public String somar(String a, String b) {
        int resultado = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(resultado);
    }

    public String subtrair(String a, String b) {
        int resultado = Integer.parseInt(a, 2) - Integer.parseInt(b, 2);
        return Integer.toBinaryString(resultado);
    }
}