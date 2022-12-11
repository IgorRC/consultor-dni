package com.consulta.controlador;

import com.consulta.api.ApiDni;
import com.consulta.modelo.Persona;
import com.consulta.vista.AppConsulta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class ControladorConsulta implements ActionListener, KeyListener {

    private AppConsulta apppAppConsulta;
    private Persona persona;

    public ControladorConsulta(AppConsulta appConsulta, Persona persona) {
        this.apppAppConsulta = appConsulta;
        this.persona = persona;
        apppAppConsulta.btnBuscar.addActionListener(this);
        apppAppConsulta.txtInputDNI.addKeyListener(this);
        apppAppConsulta.subMenuSalir.addActionListener(this);
    }

    public void iniciar() {
        apppAppConsulta.setVisible(true);
        apppAppConsulta.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ApiDni apiDni = new ApiDni();
        try {
            persona = apiDni.fetchApi(apppAppConsulta.txtInputDNI.getText());
        } catch (IOException ex) {
            Logger.getLogger(ControladorConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (persona.getNombre() != null) {
            System.out.println(persona.getNombre());
            apppAppConsulta.dniLbl.setText(persona.getDni());
            apppAppConsulta.nombreLbl.setText(persona.getNombre());
            apppAppConsulta.apellidoLbl.setText(persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
            apppAppConsulta.txtInputDNI.setText("");
        } else {
            JOptionPane.showMessageDialog(this.apppAppConsulta, "No se encontro ninguna persona");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (apppAppConsulta.txtInputDNI.getText().length() >= 8) {
            e.consume();
            JOptionPane.showMessageDialog(null, "8 caracteres como maximo");
        }
    }

    public void actionPerformeds(ActionEvent e) {
        System.out.println("Saliendo beba");
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
