package Clase;

/**
 *
 * @author Alba
 */
public class Punto {

   
    protected Float centroX;
    protected Float centroY;

    /**
     * Constructor vacio
     */
    public Punto() {
    }

    /**
     * Constructor con parámetros
     * @param centroX
     * @param centroY
     */
    public Punto(Float centroX, Float centroY) {
        this.centroX = centroX;
        this.centroY = centroY;
    }

    /**
     * Mostrar CentroX
     * @return
     */
    public Float getCentroX() {
        return centroX;
    }

    /**
     * Pedir centroX
     * @param centroX
     */
    public void setCentroX(Float centroX) {
        this.centroX = centroX;
    }

    /**
     * Mostrar centroY
     * @return
     */
    public Float getCentroY() {
        return centroY;
    }

    /**
     * Pedir centroy
     * @param centroY
     */
    public void setCentroY(Float centroY) {
        this.centroY = centroY;
    }
    
    
}
