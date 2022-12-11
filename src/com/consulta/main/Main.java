package com.consulta.main;
import com.consulta.controlador.ControladorConsulta;
import com.consulta.modelo.Persona;
import com.consulta.vista.AppConsulta;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AppConsulta appConsulta = new AppConsulta();
        Persona persona = new Persona();
        ControladorConsulta controladorConsulta = new ControladorConsulta(appConsulta,persona);
        controladorConsulta.iniciar();
    }
}
