public class Calculadora {
    private static double ultimoResultado;
    private double penultimoResultado;

    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return a / b;
    }
    public double calcularYGuardarUltimoResultado(double a, double b, char operacion) {
        if (operacion == '+') {
            ultimoResultado = sumar(a, b);
        } else if (operacion == '-') {
            ultimoResultado = restar(a, b);
        } else if (operacion == '*') {
            ultimoResultado = multiplicar(a, b);
        } else if (operacion == '/') {
            ultimoResultado = dividir(a, b);
        } else {
            ultimoResultado = 0;
        }
        return ultimoResultado;
    }

    public double getUltimoResultado() {
        return ultimoResultado;
    }
}
