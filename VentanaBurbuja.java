import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
public class VentanaBurbuja extends JFrame implements ActionListener{
    


    public VentanaBurbuja(){
        confiurarVentana();
        cargarComponentes();

    }
    public void confiurarVentana(){
        setVisible(true);
        setSize(900,700);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void cargarComponentes(){
        JButton boton; 
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
