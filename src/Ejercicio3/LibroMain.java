package Ejercicio3;

import javax.swing.*;

public class LibroMain {
    public static void main(String[] args) {
        String codigoPrestamo = JOptionPane.showInputDialog("Ingrese el código del préstamo:");
        String fechaPrestamo = JOptionPane.showInputDialog("Ingrese la fecha del préstamo:");
        String nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
        String codigoUsuario = JOptionPane.showInputDialog("Ingrese el código del usuario:");
        int diasPrestamo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días de préstamo:"));
        String estadoPrestamo = JOptionPane.showInputDialog("Ingrese el estado del préstamo:");

        Libro libro = new Libro(codigoPrestamo, fechaPrestamo, nombreLibro, codigoUsuario, diasPrestamo, estadoPrestamo);
        // Consultar el estado del préstamo
        libro.consultarEstadoPrestamo();

        // Consultar los datos del préstamo
        libro.consultarDatosPrestamo();

    }
}
