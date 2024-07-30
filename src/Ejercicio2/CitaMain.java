package Ejercicio2;

import javax.swing.*;

public class CitaMain {
    public static void main(String[] args) {
        String codigo = JOptionPane.showInputDialog("Ingrese el código de la cita:");
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la cita:");
        String hora = JOptionPane.showInputDialog("Ingrese la hora de la cita:");
        String consultorio = JOptionPane.showInputDialog("Ingrese el consultorio:");
        String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del médico:");
        String nombrePaciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
        String centroMedico = JOptionPane.showInputDialog("Ingrese el nombre del centro médico:");

        Cita cita = new Cita(codigo, fecha, hora, consultorio, nombreMedico, nombrePaciente, centroMedico);

        cita.consultarDatosCita();

        // Cambiar la hora de la cita
        String nuevaHora = JOptionPane.showInputDialog("Ingrese la nueva hora de la cita:");
        cita.cambiarHora(nuevaHora);

        // Consultar los datos de la cita después del cambio
        cita.consultarDatosCita();
    }

}
