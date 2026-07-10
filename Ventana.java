import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{
    JLabel titulo, lbBusqueda, lbOrdenamiento, etiquetaGif, lbLeyendaGif;
    JPanel pAlgoritmos, pBusqueda, pOrdenamiento, pDescripcion, pGif;
    JButton btnInsercion, btnBurbuja, btnQuickSort, btnSecuencial, btnBinaria;
    JTextArea Descripcion;
    ImageIcon iconoGif;
    
    public Ventana(){
        confiurarVentana();
        inicializarComponentes();
        mostrarDescripcion();
    }

    private void confiurarVentana(){
        setSize(900,700);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setTitle("Laboratorio Visual de Algoritmos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void inicializarComponentes(){
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
        Descripcion.setEditable(false);
        Descripcion.setLineWrap(true);
        Descripcion.setWrapStyleWord(true);
        pDescripcion.add(Descripcion);

        pGif = new JPanel(new GridLayout(2,1,10,10));
        etiquetaGif = new JLabel();
        lbLeyendaGif = new JLabel("", SwingConstants.CENTER);
        pGif.add(etiquetaGif);  
        pGif.add(lbLeyendaGif);
        pDescripcion.add(pGif);
        pGif.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(titulo, BorderLayout.NORTH);
        add(pDescripcion, BorderLayout.EAST);
        add(pAlgoritmos, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }

    private void mostrarDescripcion(){
        //Algoritmos de Ordenamiento
        btnInsercion.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                Descripcion.setText("El algoritmo de ordenamiento por inserción es un algoritmo simple que construye la lista ordenada uno a la vez. Funciona de manera similar a cómo ordenarías cartas en tu mano. Comienza con una lista vacía y toma elementos de la lista original, insertándolos en la posición correcta en la lista ordenada.");
                iconoGif = new ImageIcon("gif/OrdenamientoPruebaGif.gif");
                etiquetaGif.setIcon(iconoGif);
                lbLeyendaGif.setText("Algoritmo de ordenamiento - Inserción.");
            }
            public void mouseExited(MouseEvent e){
            }
        });
        btnBurbuja.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                Descripcion.setText("El algoritmo de ordenamiento de burbuja es un algoritmo simple que compara elementos adyacentes y los intercambia si están en el orden incorrecto. Este proceso se repite hasta que la lista está ordenada. Aunque es fácil de entender, no es eficiente para listas grandes.");
                iconoGif = new ImageIcon("gif/OrdenamientoPruebaGif.gif");
                etiquetaGif.setIcon(iconoGif);
                lbLeyendaGif.setText("Algoritmo de ordenamiento - Burbuja.");
            }
            public void mouseExited(MouseEvent e){
            }
        });
        btnQuickSort.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                Descripcion.setText("El algoritmo de ordenamiento rápido (QuickSort) es un algoritmo eficiente que utiliza una estrategia de divide y vencerás. Selecciona un elemento como pivote y partitiona la lista en dos sub-listas, una con elementos menores y otra con elementos mayores. Luego, aplica el mismo proceso recursivamente a cada sub-lista.");
                iconoGif = new ImageIcon("gif/OrdenamientoPruebaGif.gif");
                etiquetaGif.setIcon(iconoGif);
                lbLeyendaGif.setText("Algoritmo de ordenamiento - QuickSort");
            }
            public void mouseExited(MouseEvent e){
            }
        });

        //Algoritmos de Busqueda
        btnSecuencial.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                Descripcion.setText("El algoritmo de búsqueda secuencial (o lineal) recorre la lista uno a uno hasta encontrar el elemento deseado. Es simple de implementar pero puede ser lento para listas grandes.");
                iconoGif = new ImageIcon("gif/OrdenamientoPruebaGif.gif");
                etiquetaGif.setIcon(iconoGif);
                lbLeyendaGif.setText("Algoritmo de busqueda - Secuencial");
            }
            public void mouseExited(MouseEvent e){
            }
        });
        btnBinaria.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                Descripcion.setText("El algoritmo de búsqueda binaria (o dicotómica) funciona en listas ordenadas. Compara el elemento buscado con el elemento del medio y elimina la mitad de la lista que no contiene el elemento. Este proceso se repite hasta encontrar el elemento o determinar que no existe.");
                iconoGif = new ImageIcon("gif/OrdenamientoPruebaGif.gif");
                etiquetaGif.setIcon(iconoGif);
                lbLeyendaGif.setText("Algoritmo de busqueda - Binario");
            }
            public void mouseExited(MouseEvent e){
            }
        });


    }
}