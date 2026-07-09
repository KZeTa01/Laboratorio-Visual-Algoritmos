import javax.swing.*;
import java.awt.* ;
import java.awt.event.*; 

public class Ventana extends JFrame implements ActionListener{
    JPanel panelSuperior, panelInferior, panelCentral; 
    Font fuente; 
    JLabel etiqueta; 
    

    public Ventana(){
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8,8));
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);


        //parteSuperior
        panelSuperior = new JPanel();
        fuente = new Font("Times New Roman", Font.BOLD, 30);
        etiqueta = new JLabel("LABORATORIO DE ALGORITMOS");
        etiqueta.setFont(fuente);
        panelSuperior.add(etiqueta, BorderLayout.CENTER);
        add(panelSuperior, BorderLayout.NORTH);


    }

    public void actionPerformed(ActionEvent e){
        
    }


    
}