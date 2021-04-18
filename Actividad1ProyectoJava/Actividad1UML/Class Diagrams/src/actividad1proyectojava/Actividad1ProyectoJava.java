package actividad1proyectojava;

import java.util.Random;
import Clase.Cono;

/**
 *
 * @author Alba María Suárez Sánchez
 */
public class Actividad1ProyectoJava {

    /**
     *
     * @param args Método main donde se introducen los valores por medio de una clase Random
     * y se muestra a través de la llamada de una función de la clase Cono
     */
    public static void main(String[] args) {

        Cono co = new Cono();
        Random random = new Random();
        String color = "Verde";
        
        System.out.println("Creación de un cono");
        System.out.println("-------------------");
        co.setCentroX(random.nextFloat());
        co.setCentroY(random.nextFloat());
        co.setRadio(random.nextFloat());
        co.setAltura(random.nextFloat());
        co.setColor(color);

        co.Imprimir();

    }
}
