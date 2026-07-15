import java.awt.*;
import javax.swing.*;

public class VentanaSecuencial extends JDialog {
    public VentanaSecuencial (JFrame ventanaPadre){
        super(ventanaPadre, "Algoritmo de busqueda - Secuencial", true);
        setSize(500,300);
        setLocationRelativeTo(ventanaPadre);
        setLayout(new BorderLayout());

        JLabel lb = new JLabel("Ventana algoritmo secuencial");
        add(lb);
    }
}
