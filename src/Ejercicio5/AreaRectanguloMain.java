package Ejercicio5;

import javax.swing.*;

public class AreaRectanguloMain {
    public static void main(String[] args) {
        String baseStr, alturaStr;
        boolean datosValidos;

        do {
            baseStr = JOptionPane.showInputDialog("Ingrese la base del rectángulo:");
            alturaStr = JOptionPane.showInputDialog("Ingrese la altura del rectángulo:");
            datosValidos = AreaRectangulo.validarDatos(baseStr, alturaStr);

            if (!datosValidos) {
                JOptionPane.showMessageDialog(null, "Datos inválidos. Por favor, ingrese valores numéricos positivos.");
            }
        } while (!datosValidos);

        double base = Double.parseDouble(baseStr);
        double altura = Double.parseDouble(alturaStr);

        AreaRectangulo rectangulo = new AreaRectangulo(base, altura);
        double area = rectangulo.calcularArea();

        String resultado = "La base del rectángulo es: " + base +
                "\nLa altura del rectángulo es: " + altura +
                "\nEl área del rectángulo es: " + area;

        System.out.println(resultado);
        JOptionPane.showMessageDialog(null, resultado);
    }
}


