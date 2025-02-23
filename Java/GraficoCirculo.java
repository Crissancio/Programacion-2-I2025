import javax.swing.*;
import java.awt.*;

// Clase Punto
class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Clase Circulo con método para dibujarse
class Circulo extends JPanel {
    Punto centro;
    int radio;

    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
        setPreferredSize(new Dimension(400, 400)); // Tamaño del panel
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawOval(centro.x*10, centro.y*10, 2 * radio * 10, 2 * radio * 10);
    }

    // Método para mostrar el círculo en una ventana
    public void mostrar() {
        JFrame frame = new JFrame("Dibujar Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
}

// Clase principal
public class GraficoCirculo {
    public static void main(String[] args) {
        Punto centro = new Punto(2, 2);
        int radio = 5;
        Circulo circulo = new Circulo(centro, radio);
        circulo.mostrar(); // Muestra la ventana con el círculo
    }
}
