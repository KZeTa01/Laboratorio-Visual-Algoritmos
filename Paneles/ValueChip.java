package Paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

/**
 * Representa un unico "cuadro" (chip) que muestra el indice y el valor
 * de un elemento del arreglo, por ejemplo: "[4] 6".
 * Cambia de color segun su estado (NORMAL = azul, ANALIZANDO = naranja).
 */
public class ValueChip extends JComponent {

    public enum Estado {
        NORMAL,      // color azul por defecto
        ANALIZANDO   // color naranja: se esta comparando/analizando este valor
        // Mas adelante se pueden sumar mas estados (ORDENADO, PIVOTE, etc.)
        // y agregar su color correspondiente en paintComponent().
    }

    private static final Color BORDE_NORMAL  = new Color(0x5B9BD5);
    private static final Color TEXTO_NORMAL  = new Color(0x2E5C8A);
    private static final Color BORDE_ANALIZA = new Color(0xE38B4B);
    private static final Color TEXTO_ANALIZA = new Color(0xB85C1F);
    private static final Color FONDO_CHIP    = new Color(0xF6F8FB);

    private final int indice;
    private int valor;
    private Estado estado = Estado.NORMAL;

    public ValueChip(int indice, int valor) {
        this.indice = indice;
        this.valor = valor;
        setPreferredSize(new Dimension(66, 42));
        setOpaque(false);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        repaint();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setValor(int valor) {
        this.valor = valor;
        repaint();
    }

    public int getIndice() {
        return indice;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        boolean analizando = estado == Estado.ANALIZANDO;
        Color colorBorde = analizando ? BORDE_ANALIZA : BORDE_NORMAL;
        Color colorTexto = analizando ? TEXTO_ANALIZA : TEXTO_NORMAL;

        int w = getWidth() - 2;
        int h = getHeight() - 2;
        RoundRectangle2D fondo = new RoundRectangle2D.Float(1, 1, w, h, 14, 14);

        g2.setColor(FONDO_CHIP);
        g2.fill(fondo);

        g2.setStroke(new BasicStroke(1.6f));
        g2.setColor(colorBorde);
        g2.draw(fondo);

        String texto = "[" + indice + "] " + valor;
        g2.setFont(getFont().deriveFont(Font.PLAIN, 13f));
        FontMetrics fm = g2.getFontMetrics();
        int tx = (getWidth() - fm.stringWidth(texto)) / 2;
        int ty = (getHeight() + fm.getAscent() - fm.getDescent()) / 2;
        g2.setColor(colorTexto);
        g2.drawString(texto, tx, ty);

        g2.dispose();
    }
}