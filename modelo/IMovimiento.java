public interface IMovimiento {
    boolean validarMovimiento(Casilla origen, Casilla destino);
    void moverA(Casilla destino);
}