import java.util.ArrayList;

public class ControladorTurno {
    private ArrayList<Personaje> escuadron;
    private int indiceTurno;

    public ControladorTurno(ArrayList<Personaje> escuadron) {
        this.escuadron = escuadron;
        this.indiceTurno = 0;
    }

    public void agregarPersonaje(Personaje p) {
        if (escuadron.size() < 4) {
            escuadron.add(p);
        }
    }

    public void siguienteTurno() {
        // Avanzamos el índice, si llega al final, vuelve a 0 (ciclo)
        indiceTurno++;
        if (indiceTurno >= escuadron.size()) {
            indiceTurno = 0;
            // Aquí podríamos indicar que es el turno del enemigo, por ejemplo
        }
        
        // Al darle el turno a un personaje, reiniciamos sus puntos de acción
        Personaje personajeActual = escuadron.get(indiceTurno);
        personajeActual.reiniciarPuntosAccion();
        System.out.println("Es el turno de un nuevo personaje.");
    }
}