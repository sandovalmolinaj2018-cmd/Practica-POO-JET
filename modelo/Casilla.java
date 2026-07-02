public class Casilla {
    private int coordX;
    private int coordY;
    private boolean ocupada;

    public Casilla(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.ocupada = false;
    }

    public boolean isOcupada() {return ocupada;}
   
    //Getters y Setters
    public int getCoordX() {return coordX;}
    public int getCoordY() {return coordY;}
    public void setOcupada(boolean ocupada) {this.ocupada = ocupada;}
}