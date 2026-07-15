import java.awt.*;
import javax.swing.*;

public class VentanaInsercion extends JDialog {
    public VentanaInsercion (JFrame ventanaPadre){
        super(ventanaPadre, "Algoritmo de ordenamiento - Inserción", true);
        setSize(500,300);
        setLocationRelativeTo(ventanaPadre);
        setLayout(new BorderLayout());

        JLabel lb = new JLabel("Ventana algoritmo inserción");
        add(lb);
    }
}
