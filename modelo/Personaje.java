public class Personaje implements IMovimiento {
    
    private String nombre;
    private int vida;
    private int puntosAccion;
    private Casilla posicionActual;

    public Personaje(String nombre, int vida, int puntosAccion, Casilla posicionActual) {
        this.nombre = nombre;
        this.vida = vida;
        this.puntosAccion = 2;
        this.posicionActual = posicionActual;
    }

    public void reiniciarPuntosAccion() {
        this.puntosAccion = 2;
    }

//---METODOS INTERFAZ
    @Override
    public boolean validarMovimiento(Casilla destino) {
        return this.puntosAccion > 0 && !destino.isOcupada();
    }

    @Override
    public void moverA(Casilla destino) {
        if (validarMovimiento(destino)) {
            if (this.posicionActual != null) {
                this.posicionActual.setOcupada(false);
            }
            this.posicionActual = destino;
            this.posicionActual.setOcupada(true);
            this.puntosAccion--;
            System.out.println(nombre + " se ha movido");
        } else {
            System.out.println(nombre + " no puede moverse a la casilla destino");
        }
    }
}