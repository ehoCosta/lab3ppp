public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new CalculadoraAdapter(new CalculadoraBinaria());

        int a = 54;
        int b = 6;

        System.out.println("Soma: " + a + " + " + b + " = " + calculadora.somar(a, b));
        System.out.println("Subtração: " + a + " - " + b + " = " + calculadora.subtrair(a, b));
        System.out.println("Multiplicação: " + a + " * " + b + " = " + calculadora.multiplicar(a, b));
    }
}