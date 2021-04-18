package clase;

import java.util.Random;

public class Cono {

    private float altura;

    private String color;

    public Cono() {
    }

    public Cono(float altura, String color) {
        this.altura = altura;
        this.color = color;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void imprimir() {
        Punto p = new Punto();
        Circulo ci = new Circulo();
        Random random = new Random();

        p.setX(random.nextFloat());
        p.setY(random.nextFloat());
        ci.setRadio(random.nextFloat());
        p.Imprimir();
        ci.imprimir();
        System.out.println("\nAltura: " + altura + "\nColor: " + color);
        System.out.println("------------------------------------------------");
    }
}
