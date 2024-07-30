package Ejercicio1;

import javax.swing.*;

public class UsuarioMain {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        JOptionPane.showMessageDialog(null, "Bienvenido");

        String usuarioBase1 = "" ;
        usuarioBase1 = JOptionPane.showInputDialog("escribe tu usuario");

        String claveBase = "";
        claveBase = JOptionPane.showInputDialog("Escribe tu clave");

        String resultado = "UsuarioBase: " + usuarioBase1 + "ClaveBase: " + claveBase;
        JOptionPane.showConfirmDialog(null, resultado);

       String x =  JOptionPane.showInputDialog(null, "Quieres cambiar el usuario? si  o no " );

        if (x.equals(("si"))) {
            String usuarioIngresado = "";
            usuarioIngresado = JOptionPane.showInputDialog(null, "Ingresa tu nuevo usuario");
            String nuevousuario = "UsuarioIngresado: " + usuarioIngresado;
            JOptionPane.showConfirmDialog(null, nuevousuario);

        }else{

            JOptionPane.showMessageDialog(null, usuarioBase1);
        }








            String y= JOptionPane.showInputDialog(null, "Quieres cambiar la clave? si o no");
        if (y.equals(("si"))) {
            String claveIngresada = "";
            claveIngresada = JOptionPane.showInputDialog(null, "Ingresa tu nueva clave");
            String nuevaclave = "ClaveIngresada:" + claveIngresada;
            JOptionPane.showConfirmDialog(null, nuevaclave);
        } else {
            JOptionPane.showMessageDialog(null, claveBase);
        }

    }
}



