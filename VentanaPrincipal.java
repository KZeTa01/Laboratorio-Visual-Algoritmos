
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Paneles.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
    
    public VentanaPrincipal(){
        PaneLab Laboratorio = new PaneLab();
        PaneInterativo Interativo = new PaneInterativo();
        PaneRegistros Registros = new PaneRegistros();
        
        confiurarVentana();
        cargarComponentes(Laboratorio, Interativo, Registros);
    }
    public void confiurarVentana(){
        setVisible(true);
        setSize(900,700);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void cargarComponentes(PaneLab Laboratorio, PaneInterativo Interativo, PaneRegistros Registros){
        JTabbedPane pestañas;  

        pestañas = new JTabbedPane();

        pestañas.addTab("Laboratorio", Laboratorio);
        pestañas.addTab("Interativo", Interativo);
        pestañas.addTab("Registros", Registros);

        add(pestañas);
    }



    public void actionPerformed(ActionEvent e) {
        
    }
}