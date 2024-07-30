package Ejercicio6;

import javax.swing.*;

public class Envio {
    private String numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    private String cedulaCliente;
    private double peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double costo;
    private boolean estadoEnviado;

    // Constructor
    public Envio(String numeroGuia, String fecha, String tipoEmbalaje, String cedulaCliente,
                 double peso, String ciudadOrigen, String ciudadDestino, double costo, boolean estadoEnviado) {
        this.numeroGuia = numeroGuia;
        this.fecha = fecha;
        this.tipoEmbalaje = tipoEmbalaje;
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.estadoEnviado = estadoEnviado;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstadoEnviado() {
        return estadoEnviado;
    }

    public void setEstadoEnviado(boolean estadoEnviado) {
        this.estadoEnviado = estadoEnviado;
    }
    public void verificarEntrega() {
        String estado = estadoEnviado ? "El envío ha sido entregado." : "El envío no ha sido entregado.";
        System.out.println(estado);
        JOptionPane.showMessageDialog(null, estado);
    }

    // Método para consultar los datos del envío
    public void consultarDatosEnvio() {
        String datos = this.toString();
        System.out.println(datos);
        JOptionPane.showMessageDialog(null, datos);
    }

    @Override
    public String toString() {
        return "Envio{" +
                "numeroGuia='" + numeroGuia + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipoEmbalaje='" + tipoEmbalaje + '\'' +
                ", cedulaCliente='" + cedulaCliente + '\'' +
                ", peso=" + peso +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", ciudadDestino='" + ciudadDestino + '\'' +
                ", costo=" + costo +
                ", estadoEnviado=" + estadoEnviado +
                '}';
    }
}
