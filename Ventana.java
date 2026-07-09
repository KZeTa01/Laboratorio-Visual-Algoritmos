import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
    JLabel titulo;
    JPanel pCentro, pAlgoritmos, pDescripcion;
    
    public Ventana(){
        setSize(900,700);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setTitle("Laboratorio Visual de Algoritmos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);

        titulo = new JLabel("LABORATORIO VISUAL DE ALGORITMOS",  SwingConstants.CENTER);
        //Configurar fuente personalizada para el JLabel 
        Font fuente = new Font("Times New Roman", Font.BOLD,30);
        titulo.setFont(fuente);
        titulo.setForeground(Color.WHITE);
        //Metodo para cambiar el color del fondo del JFrame

        pCentro= new JPanel(new GridBagLayout());
        pAlgoritmos= new JPanel(new GridLayout());
        pDescripcion = new JPanel();

        add(titulo, BorderLayout.NORTH);

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}