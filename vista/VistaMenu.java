import javax.swing.JFrame;
import javax.swing.JButton;

// Pantalla de inicio
public class VistaMenu extends JFrame {
    public VistaMenu() {
        setTitle("Menú Principal - Mortal Tower");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btnJugar = new JButton("Iniciar Juego");
        add(btnJugar);
        // Aquí luego agregaremos los ActionListeners para conectar con el Controlador
    }
}