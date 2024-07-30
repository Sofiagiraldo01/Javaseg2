package Ejercicio2;

import javax.swing.*;

public class Cita {
    private String codigo;
    private String fecha;
    private String hora;
    private String consultorio;
    private String nombreMedico;
    private String nombrePaciente;
    private String centroMedico;

    // Constructor
    public Cita(String codigo, String fecha, String hora, String consultorio,
                String nombreMedico, String nombrePaciente, String centroMedico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
        this.centroMedico = centroMedico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCentroMedico() {
        return centroMedico;
    }

    public void setCentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }
    public void consultarDatosCita() {
        String datos = this.toString();
        System.out.println(datos);
        JOptionPane.showMessageDialog(null, datos);
    }
    public void cambiarHora(String nuevaHora) {
        this.hora = nuevaHora;
        System.out.println("La hora de la cita ha sido cambiada a: " + nuevaHora);
        JOptionPane.showMessageDialog(null, "La hora de la cita ha sido cambiada a: " + nuevaHora);
    }

    @Override
    public String toString() {
        return "Cita{" +
                "codigo='" + codigo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", consultorio='" + consultorio + '\'' +
                ", nombreMedico='" + nombreMedico + '\'' +
                ", nombrePaciente='" + nombrePaciente + '\'' +
                ", centroMedico='" + centroMedico + '\'' +
                '}';
    }
}
