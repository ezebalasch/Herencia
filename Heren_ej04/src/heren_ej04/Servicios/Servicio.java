package heren_ej04.Servicios;

import heren_ej04.Entidades.Circulo;
import heren_ej04.Entidades.Rectangulo;
import heren_ej04.calculosFormas;
import java.util.Scanner;

public class Servicio implements calculosFormas {

    private Scanner leer = new Scanner(System.in);

    @Override
    public Double areaCirculo(Circulo c1) {
        Double area;
        pedirDatosC(c1);
        area = (Math.PI * c1.getRadio()) / (Math.PI * c1.getDiametro());
        return area;
    }

    public Circulo pedirDatosC(Circulo c1) {
        System.out.println("Ingrese el radio del Circulo");
        System.out.println("");
        c1.setRadio(leer.nextDouble());
        System.out.println("Ingrese el diametro del Circulo");
        System.out.println("");
        c1.setDiametro(leer.nextDouble());
        System.out.println("El area del Circulo es");

        return c1;
    }

    @Override
    public Double areaRectangulo(Rectangulo r1) {
        Double area;
        pedirDatosR(r1);
        area = (r1.getAltura() * r1.getBase()) / (r1.getAltura() + r1.getBase()) * 2;
        System.out.println("El area del Rectangulo es");

        return area;
    }

    public Rectangulo pedirDatosR(Rectangulo r1) {
        System.out.println("Ingrese la altura del Rectangulo");
        System.out.println("");
        r1.setAltura(leer.nextDouble());
        System.out.println("Ingrese la base del Rectangulo");
        System.out.println("");
        r1.setBase(leer.nextDouble());
        return r1;
    }

}
