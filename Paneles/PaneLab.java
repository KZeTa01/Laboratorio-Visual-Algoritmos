package Paneles;

import javax.swing.*;
import java.awt.*;

public class PaneLab extends JPanel{
    public PaneLab(){
        cargarPaneLab();
        cargarComponentesLab();
    }

    public void cargarPaneLab(){
        setLayout(new BorderLayout());

    }
    public void cargarComponentesLab(){
        JSpinner spin; 
        JSlider velodidad;
        JButton Generar,ejecutar, manual;  
        JComboBox combo; 
        JRadioButton ordenamiento,busqueda; 
        ButtonGroup grupo; 
        JPanel superior,S1,S2,S22,S3,S33,S4,medio1,medio2,inferior,izquierda,IzModo,IzAlgoritmo,Izdatos;
        String[] busq,ord; 
        
        //PRIMER PANEL(Panel de modos)
        S1 =new JPanel(new GridLayout(4,1,10,10));
        S1.setBorder(BorderFactory.createTitledBorder("Modo")); 
            //Generando el grupo de botones
                grupo = new ButtonGroup(); 
                ordenamiento = new JRadioButton("Ordenamiento"); 
                busqueda = new JRadioButton("Busqueda");
                //agregando los botones al grupo
                grupo.add(ordenamiento);
                grupo.add(busqueda);
            //creando combo de algoritmos de busqueda
                
                ord = new String[4]; 

                ord[0] = "Selección"; 
                ord[1] = "Inserción"; 
                ord[2] = "Burbuja"; 
                ord[3] = "QuickSort"; 
                combo  = new JComboBox<>(ord);
        //Agregando los componentes al grupo y al panel
            S1.add(ordenamiento);
            S1.add(busqueda);
            S1.add(combo);
          
        //SEGUNDO PANEL(Panel de Datos)

        S2 = new JPanel(new GridLayout(2,1,10,5));
        S2.setBorder(BorderFactory.createTitledBorder("DATOS Y CANTIDAD"));

        spin = new JSpinner(new SpinnerNumberModel(5, 5, 100, 1));

        S22 = new JPanel(new GridLayout(2,1,40,10));

        //Llenando el combo
             
        
        S22.add(spin);
        
        S2.add(S22);

        //Panel superior izquierdo abajo
        S3 = new JPanel(new GridLayout(3,1));
        S33 = new JPanel(new FlowLayout(FlowLayout.LEFT,4,4));
        
        Generar = new JButton("Generar aleatoriamente");

        S3.add(new JLabel("Cantidad de Datos"));
        
        S3.add(Generar, FlowLayout.LEFT);

        //Panel superior izquierdo inferior
        S4 = new JPanel(new GridLayout(3,1));
        ejecutar = new JButton("Ejecutar");

        S4.add(new JLabel("Velocidad"));
        velodidad = new JSlider(1, 10, 1);
        S4.add(velodidad);
        S4.add(ejecutar);
        

        //Agregar paneles al panel superior
        superior = new JPanel(new GridLayout(4,1));
        superior.add(S1);
        superior.add(S2);
        superior.add(S3);
        superior.add(S4);

        add(superior, BorderLayout.WEST);
    }
}

