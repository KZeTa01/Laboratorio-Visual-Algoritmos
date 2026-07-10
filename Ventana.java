import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
    JLabel titulo, lbBusqueda, lbOrdenamiento, etiquetaGif;
    JPanel pAlgoritmos, pBusqueda, pOrdenamiento, pDescripcion, pGif;
    JButton btnInsercion, btnBurbuja, btnQuickSort, btnSecuencial, btnBinaria;
    JTextArea Descripcion;
    
    public Ventana(){
        setSize(900,700);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setTitle("Laboratorio Visual de Algoritmos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Crear Fuentes
        Font fTitulo = new Font("Times New Roman", Font.BOLD,30);
        Font fSubtemas = new Font("Times New Roman", Font.BOLD, 20);
        
        //Titulo (NORTH)
        titulo = new JLabel("LABORATORIO VISUAL DE ALGORITMOS",  SwingConstants.CENTER);
            //Configurar fuente personalizada para el JLabel 
            titulo.setFont(fTitulo);
        
        //Paneles
        pAlgoritmos= new JPanel(new GridLayout(2,1,10,10));
        pAlgoritmos.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        pBusqueda = new JPanel(new GridLayout(3,1,10,10));
        pOrdenamiento = new JPanel(new GridLayout(4,1,10,10));
        
        //Panel Algoritmos (CENTER)
            //Ordenamiento
        lbOrdenamiento = new JLabel("Algoritmos de Ordenamiento");
            lbOrdenamiento.setFont(fSubtemas);
        btnInsercion = new JButton("Inserción");
        btnBurbuja = new JButton("Burbuja");
        btnQuickSort = new JButton("QuickSort");
            //Busqueda
        lbBusqueda = new JLabel("Algoritmos de Busqueda");
            lbBusqueda.setFont(fSubtemas);
        btnSecuencial = new JButton("Secuencial o lineal");
        btnBinaria = new JButton("Binaria o dicotómica");
        
        pOrdenamiento.add(lbOrdenamiento);
        pOrdenamiento.add(btnInsercion);
        pOrdenamiento.add(btnBurbuja);
        pOrdenamiento.add(btnQuickSort);

        pBusqueda.add(lbBusqueda);
        pBusqueda.add(btnSecuencial);
        pBusqueda.add(btnBinaria);

        pAlgoritmos.add(pOrdenamiento);
        pAlgoritmos.add(pBusqueda);
        
        pDescripcion = new JPanel(new GridLayout(2,1));
        Descripcion = new JTextArea(20,40);
        pDescripcion.add(Descripcion);

        pGif = new JPanel(new FlowLayout());
        ImageIcon iconoGif = new ImageIcon("gif/OrdenamientoPruebaGif.gif");
        etiquetaGif = new JLabel(iconoGif);
        pGif.add(etiquetaGif);  
        pDescripcion.add(pGif);

        add(titulo, BorderLayout.NORTH);
        add(pDescripcion, BorderLayout.EAST);
        add(pAlgoritmos, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
}