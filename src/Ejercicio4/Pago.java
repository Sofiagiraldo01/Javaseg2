package Ejercicio4;

import javax.swing.*;

public class Pago {
    private String codigoEmpleado;
    private double salarioBasico;
    private double horasExtra;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;

    // Constructor
    public Pago(String codigoEmpleado, double salarioBasico, double horasExtra, int numeroHoras,
                double descuento, double descuentoPrestamo, double bonificacion) {
        this.codigoEmpleado = codigoEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtra = horasExtra;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
        calcularNeto();
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(double descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
    public double calcularValorHorasExtra() {
        return horasExtra * numeroHoras;
    }

    // Método para calcular el valor devengado
    public double calcularDevengado() {
        return salarioBasico + calcularValorHorasExtra() + bonificacion;
    }

    // Método para calcular el valor deducido
    public double calcularDeducido() {
        return descuento + descuentoPrestamo;
    }

    // Método para calcular el valor neto
    public void calcularNeto() {
        this.neto = calcularDevengado() - calcularDeducido();
    }

    // Método para consultar los datos del pago
    public void consultarDatosPago() {
        calcularNeto();
        String datos = this.toString();
        System.out.println(datos);
        JOptionPane.showMessageDialog(null, datos);
    }

    @Override
    public String toString() {
        return "Pago{" +
                "codigoEmpleado='" + codigoEmpleado + '\'' +
                ", salarioBasico=" + salarioBasico +
                ", horasExtra=" + horasExtra +
                ", numeroHoras=" + numeroHoras +
                ", descuento=" + descuento +
                ", descuentoPrestamo=" + descuentoPrestamo +
                ", bonificacion=" + bonificacion +
                ", neto=" + neto +
                '}';
    }
}