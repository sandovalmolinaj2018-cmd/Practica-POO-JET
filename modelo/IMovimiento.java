public interface IMovimiento {
    boolean validarMovimiento(Casilla destino);
    void moverA(Casilla destino);
}