package Clase;

/**
 *
 * @author Alba María Suárez Sánchez
 */
public class Cono extends Circulo {

    private float altura;

    private String color;

    /**
     *Constructor vacio
     */
    public Cono() {
    }

    /**
     * Constructor con parámetros
     * @param altura
     * @param color
     */
    public Cono(float altura, String color) {
        this.altura = altura;
        this.color = color;
    }

    /**
     * Llamada para mostrar altura
     * @return
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Pedir la altura
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Mostrar color
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Pedir color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Método para imprimir todos los atributos de Cono y sus heredados
     */
    public void Imprimir() {
       
        
        System.out.println("Punto x = " + centroX + " Punto y = " + centroY + "\nRadio = " + radio  + "\nAltura = " + altura + " de color = " + color);
        
    }
}
