package vista;
import javax.swing.JFrame;

// Pantalla del tablero de juego
public class VistaJuego extends JFrame {
    public VistaJuego() {
        setTitle("Tablero Táctico");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Aquí luego pintaremos la cuadrícula (las casillas) usando JPanel
    }
}