import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
    JLabel titulo,busqueda;
    JPanel pCentro,C1,C2, pAlgoritmos, pDescripcion;
    JButton b1,b2,b3;
    
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

        //Panel centro, opciones

        C1 =new JPanel(new GridLayout(4,1));
        C2 =new JPanel(new FlowLayout());
        b1 = new JButton("Busqueda Secuencial"); 
        b2 = new JButton("Busqueda Binaria");
        b3 = new JButton("Arreglo de caracteres");

        C1.add(new JLabel("ALGORITMOS DE BUSQUEDA"));
        C1.add(b1);
        C1.add(b2);
        C1.add(b3);
        C2.add(C1);

        C2.setBackground(Color.BLACK);
        add(C2,BorderLayout.WEST);



    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}