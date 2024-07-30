package Ejercicio6;

import javax.swing.*;

public class EnvioMain {
    public static void main(String[] args) {
        String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía:");
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha del envío:");
        String tipoEmbalaje = JOptionPane.showInputDialog("Ingrese el tipo de embalaje:");
        String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío (kg):"));
        String ciudadOrigen = JOptionPane.showInputDialog("Ingrese la ciudad de origen:");
        String ciudadDestino = JOptionPane.showInputDialog("Ingrese la ciudad de destino:");
        double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del envío:"));
        boolean estadoEnviado = JOptionPane.showConfirmDialog(null, "¿El envío ha sido enviado?", "Estado del envío", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        Envio envio = new Envio(numeroGuia, fecha, tipoEmbalaje, cedulaCliente, peso, ciudadOrigen, ciudadDestino, costo, estadoEnviado);

        // Consultar los datos del envío
        envio.consultarDatosEnvio();




        // Verificar la entrega del envío
        envio.verificarEntrega();
    }
}
