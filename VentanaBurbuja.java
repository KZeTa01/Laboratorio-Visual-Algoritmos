import java.awt.*;
import javax.swing.*;

public class VentanaBurbuja extends JDialog {
    public VentanaBurbuja (JFrame ventanaPadre){
        super(ventanaPadre, "Algoritmo de ordenamiento - Burbuja", true);
        setSize(500,300);
        setLocationRelativeTo(ventanaPadre);
        setLayout(new BorderLayout());

        JLabel lb = new JLabel("Ventana algoritmo burbuja");
        add(lb);
    }
    
}
