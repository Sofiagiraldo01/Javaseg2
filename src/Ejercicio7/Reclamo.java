package Ejercicio7;

import javax.swing.*;

public class Reclamo {
    private String numeroReclamo;
    private String nombrePersona;
    private String asunto;
    private String descripcionReclamo;
    private String estadoReclamo;

    // Constructor
    public Reclamo(String numeroReclamo, String nombrePersona, String asunto, String descripcionReclamo, String estadoReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.descripcionReclamo = descripcionReclamo;
        this.estadoReclamo = estadoReclamo;
    }

    public String getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(String numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcionReclamo() {
        return descripcionReclamo;
    }

    public void setDescripcionReclamo(String descripcionReclamo) {
        this.descripcionReclamo = descripcionReclamo;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public void validarEstadoReclamo() {
        String mensaje;
        switch (estadoReclamo.toLowerCase()) {
            case "pendiente":
                mensaje = "El reclamo está pendiente.";
                break;
            case "en proceso":
                mensaje = "El reclamo está en proceso.";
                break;
            case "resuelto":
                mensaje = "El reclamo ha sido resuelto.";
                break;
            default:
                mensaje = "Estado del reclamo desconocido.";
                break;
        }
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje);
    }
    public void mostrarMensajeRecepcion() {
        String mensaje = "Reclamo recibido con éxito.\n" +
                "Número de Reclamo: " + numeroReclamo + "\n" +
                "Nombre: " + nombrePersona + "\n" +
                "Asunto: " + asunto + "\n" +
                "Descripción: " + descripcionReclamo + "\n" +
                "Estado: " + estadoReclamo;
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public String toString() {
        return "Reclamo{" +
                "numeroReclamo='" + numeroReclamo + '\'' +
                ", nombrePersona='" + nombrePersona + '\'' +
                ", asunto='" + asunto + '\'' +
                ", descripcionReclamo='" + descripcionReclamo + '\'' +
                ", estadoReclamo='" + estadoReclamo + '\'' +
                '}';
    }
}