package principal;

// Importamos la ventana del menú que creamos en el paquete vista
import vista.VistaMenu;

// Importamos la librería de Java para manejar las ventanas de forma segura
import javax.swing.SwingUtilities;

public class Main {

    // Este es el método principal, el motor de arranque de todo programa en Java
    public static void main(String[] args) {
        
        // Usamos invokeLater por seguridad. Asegura que la ventana se construya 
        // en el hilo correcto del procesador, evitando errores gráficos.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // 1. Instanciamos (creamos) un nuevo objeto de nuestra VistaMenu
                VistaMenu menuPrincipal = new VistaMenu();
                
                // 2. Centramos la ventana en el medio de la pantalla
                menuPrincipal.setLocationRelativeTo(null);
                
                // 3. Hacemos que la ventana sea visible para el usuario
                menuPrincipal.setVisible(true);
                
                // Imprimimos un mensaje en la consola para confirmar que el código base funciona
                System.out.println("¡El juego Mortal Tower se ha iniciado correctamente y Java funciona bien!");
            }
        });
    }
}