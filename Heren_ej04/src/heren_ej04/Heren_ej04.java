/*
// Curso Egg FullStack
 */
package heren_ej04;

import heren_ej04.Entidades.Circulo;
import heren_ej04.Entidades.Rectangulo;
import heren_ej04.Servicios.Servicio;

public class Heren_ej04 {

    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        Circulo c1 = new Circulo();
        Rectangulo r1 = new Rectangulo();
        System.out.println();
        System.out.println(s1.areaCirculo(c1));
        System.out.println(s1.areaRectangulo(r1));
    }

}
