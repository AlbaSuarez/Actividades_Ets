package clase;

public class Punto {

    private Float X;

    private Float Y;

    public Punto() {
    }

    public Punto(Float X, Float Y) {
        this.X = X;
        this.Y = Y;
    }

    public Float getX() {
        return X;
    }

    public void setX(Float X) {
        this.X = X;
    }

    public Float getY() {
        return Y;
    }

    public void setY(Float Y) {
        this.Y = Y;
    }

    public void Imprimir() {
        
        System.out.println("Punto X: " + X + "\nPunto Y: " + Y);
    }
}
