package vista;

import javax.swing.JFrame;
import javax.swing.JButton;

// Pantalla de inicio
public class VistaMenu extends JFrame {
    public VistaMenu() {
        setTitle("Menú Principal - Juego de Estrategia");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
    
        JButton btnJugar = new JButton("Iniciar Juego");
        btnJugar.setBounds(20, 200, 180, 40);
        btnJugar.addActionListener(e -> {
            VistaJuego vistaJuego = new VistaJuego();
            vistaJuego.setLocationRelativeTo(null);
            vistaJuego.setVisible(true);
            this.dispose(); // Cerramos el menú al iniciar el juego
        });
        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(20, 500, 180, 40);
        btnSalir.addActionListener(e -> System.exit(0));

        add(btnSalir);
        add(btnJugar);
    }
}