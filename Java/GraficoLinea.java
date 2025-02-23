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

// Clase Linea con capacidad de dibujarse
class Linea extends JPanel {
    Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400)); // Tamaño del panel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(p1.x*10, p1.y*10, p2.x*10, p2.y*10);
    }

    // Método para mostrar la ventana con la línea
    public void mostrar() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); // Agrega el panel Linea directamente
        frame.pack(); // Ajusta el tamaño según el panel
        frame.setVisible(true);
    }
}

// Clase principal
public class GraficoLinea {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 5);
        Punto p2 = new Punto(3, 3);
        Linea linea = new Linea(p1, p2);
        linea.mostrar(); // Muestra la ventana con la línea
    }
}
