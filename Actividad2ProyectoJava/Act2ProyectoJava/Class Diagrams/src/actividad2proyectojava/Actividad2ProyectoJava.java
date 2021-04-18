package actividad2proyectojava;

import java.util.Random;
import clase.Cono;

public class Actividad2ProyectoJava {

    public static void main(String[] args) {

        Cono co = new Cono();
        Random random = new Random();
        String color = "Amarillo";
        
        System.out.println("Creación de un cono");
        System.out.println("------------------------------------------------");

        co.setAltura(random.nextFloat());
        co.setColor(color);

        co.imprimir();

    }

}
