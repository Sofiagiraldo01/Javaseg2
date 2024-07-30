package Ejercicio4;

import javax.swing.*;

public class PagoMain {
    public static void main(String[] args) {
        String codigoEmpleado = JOptionPane.showInputDialog("Ingrese el código del empleado:");
        double salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico:"));
        double horasExtra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la hora extra:"));
        int numeroHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas extra:"));
        double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento:"));
        double descuentoPrestamo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento del préstamo:"));
        double bonificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la bonificación:"));

        Pago pago = new Pago(codigoEmpleado, salarioBasico, horasExtra, numeroHoras, descuento, descuentoPrestamo, bonificacion);

        // Consultar los datos del pago
        pago.consultarDatosPago();
    }
}
