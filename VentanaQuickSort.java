import java.awt.*;
import javax.swing.*;

public class VentanaQuickSort extends JDialog {
    public VentanaQuickSort (JFrame ventanaPadre){
        super(ventanaPadre, "Algoritmo de ordenamiento - QuickSort", true);
        setSize(500,300);
        setLocationRelativeTo(ventanaPadre);
        setLayout(new BorderLayout());

        JLabel lb = new JLabel("Ventana algoritmo quicksort");
        add(lb);

    }
}
