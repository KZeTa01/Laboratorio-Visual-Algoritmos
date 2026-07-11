import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaInsercion extends JFrame implements ActionListener{

    public VentanaInsercion(){
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
        
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
