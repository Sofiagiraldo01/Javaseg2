package Ejercicio3;

import javax.swing.*;

public class Libro {
    private String codigoPrestamo;
    private String fechaPrestamo;
    private String nombreLibro;
    private String codigoUsuario;
    private int diasPrestamo;
    private String estadoPrestamo;

    // Constructor
    public Libro(String codigoPrestamo, String fechaPrestamo, String nombreLibro,
                 String codigoUsuario, int diasPrestamo, String estadoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.nombreLibro = nombreLibro;
        this.codigoUsuario = codigoUsuario;
        this.diasPrestamo = diasPrestamo;
        this.estadoPrestamo = estadoPrestamo;
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public void consultarEstadoPrestamo() {
        String estado = "Estado del préstamo: " + this.estadoPrestamo;
        System.out.println(estado);
        JOptionPane.showMessageDialog(null, estado);
    }

    // Método para consultar los datos del préstamo
    public void consultarDatosPrestamo() {
        String datos = this.toString();
        System.out.println(datos);
        JOptionPane.showMessageDialog(null, datos);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigoPrestamo='" + codigoPrestamo + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", nombreLibro='" + nombreLibro + '\'' +
                ", codigoUsuario='" + codigoUsuario + '\'' +
                ", diasPrestamo=" + diasPrestamo +
                ", estadoPrestamo='" + estadoPrestamo + '\'' +
                '}';
    }
}