package Clase;

/**
 *
 * @author Alba María Suárez Sánchez
 */
public class Circulo extends Punto {

    /**
     *
     */
    protected Float radio;

    /**
     * Constructor Vacio
     */
    public Circulo() {
    }
    
    /**
     * Constructor con parámetros
     * @param radio
     */
    public Circulo(Float radio) {
        this.radio = radio;
    }
    
    /**
     * Llamada para imprimir el radio
     * @return
     */
    public Float getRadio() {
        return radio;
    }

    /**
     * Llamada para pedir el radio
     * @param radio
     */
    public void setRadio(Float radio) {
        this.radio = radio;
    }
    
    
}
