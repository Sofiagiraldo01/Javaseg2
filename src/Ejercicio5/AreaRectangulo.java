package Ejercicio5;

public class AreaRectangulo {
    private double base;
    private double altura;

    // Constructor
    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public static boolean validarDatos(String baseStr, String alturaStr) {
        try {
            double base = Double.parseDouble(baseStr);
            double altura = Double.parseDouble(alturaStr);
            return base > 0 && altura > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "AreaRectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
