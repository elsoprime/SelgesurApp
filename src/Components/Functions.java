/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import Views.Loader;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import rojeru_san.RSButton;

/**
 *
 * @author ELSO
 */
public class Functions {
    
    // Método para Activar JTexField & JComboBox
    public void ActivarJText(JPanel Panel) {
        for (Object o : Panel.getComponents()) {
            if (o instanceof JTextField) {
                ((JTextField) o).setEnabled(true);
            }
            for (Object c : Panel.getComponents()) {
                if (c instanceof JComboBox) {
                    ((JComboBox) c).setEnabled(true);
                }
            }
            for (Object d : Panel.getComponents()) {
                if (d instanceof JDateChooser) {
                    ((JDateChooser) d).setEnabled(true);
                }
            }
            for (Object e : Panel.getComponents()) {
                if (e instanceof JTextPane) {
                    ((JTextPane) e).setEditable(true);
                }
            }
        }
    }

    // Método para Desactivar JTextField & JComboBox
    public void DesactivarJText(JPanel Panel) {
        for (Object o : Panel.getComponents()) {
            if (o instanceof JTextField) {
                ((JTextField) o).setEnabled(false);
            }
            for (Object c : Panel.getComponents()) {
                if (c instanceof JComboBox) {
                    ((JComboBox) c).setEnabled(false);
                }
            }
            for (Object d : Panel.getComponents()) {
                if (d instanceof JDateChooser) {
                    ((JDateChooser) d).setEnabled(false);
                }
            }
            for (Object e : Panel.getComponents()) {
                if (e instanceof JTextPane) {
                    ((JTextPane) e).setEditable(false);
                }
            }
        }
    }

    // Método para Activar JButton
    public void ActivarRSJButton(JPanel Panel) {
        for (Object o : Panel.getComponents()) {
            if (o instanceof RSButton) {
                ((RSButton) o).setEnabled(true);
            }
        }
        for (Object j : Panel.getComponents()) {
            if (j instanceof JButton) {
                ((JButton) j).setEnabled(true);
            }
        }

    }

    // Método para Desactivar JButton
    public void DesactivarRSJButton(JPanel Panel) {
        for (Object o : Panel.getComponents()) {
            if (o instanceof RSButton) {
                ((RSButton) o).setEnabled(false);
            }
        }
        for (Object j : Panel.getComponents()) {
            if (j instanceof JButton) {
                ((JButton) j).setEnabled(false);
            }
        }
    }
    
    //Método para Confirmación de Cierre de Ventanas
    public void cerrarSesion(JFrame Ventana, JFrame Login) {

        int Mensaje;
        Mensaje = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas cerrar sesión", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (Mensaje == JOptionPane.YES_OPTION) {
            try {
                JOptionPane.showMessageDialog(null, "Tu sesión se cerrará y volveras a la ventana de Inicio de Sesión", "Información", JOptionPane.INFORMATION_MESSAGE);

                Login.setVisible(true);
                Ventana.dispose();

            } catch (HeadlessException e) {
                e.printStackTrace();
            }

        }
    }

    //Método Cierre de Aplicacion//
    public void confirmarSalida() {
        int Mensaje;
        Mensaje = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas salir del programa", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (JOptionPane.YES_OPTION == Mensaje) {
            JOptionPane.showMessageDialog(null, "El Programa se cerrará por completo, gracias por utilizar el software de gestión!!!.", "Información", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
    
    public void run(JLabel jlabel) {
        Thread carga = new Thread();

        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
               // JLabel.setText(Integer.toString(i));
                if (i == 100) {

                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public java.sql.Date formatoFecha(JDateChooser Fecha) {
        try {
            Date date = Fecha.getDate();
            long d = date.getTime();
            java.sql.Date nuevaFecha = new java.sql.Date(d);
//            JOptionPane.showMessageDialog(null, nuevaFecha);
            return nuevaFecha;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return null;
    }

}
