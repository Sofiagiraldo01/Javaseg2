package Ejercicio7;

import javax.swing.*;

public class ReclamoMain {
    public static void main(String[] args) {
        String numeroReclamo = JOptionPane.showInputDialog("Ingrese el número de reclamo:");
        String nombrePersona = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
        String asunto = JOptionPane.showInputDialog("Ingrese el asunto del reclamo:");
        String descripcionReclamo = JOptionPane.showInputDialog("Ingrese la descripción del reclamo:");
        String estadoReclamo = JOptionPane.showInputDialog("Ingrese el estado del reclamo (pendiente, en proceso, resuelto):");

        Reclamo reclamo = new Reclamo(numeroReclamo, nombrePersona, asunto, descripcionReclamo, estadoReclamo);

        // Mostrar el mensaje de recepción del reclamo
        reclamo.mostrarMensajeRecepcion();

        // Validar el estado del reclamo
        reclamo.validarEstadoReclamo();
    }
}
