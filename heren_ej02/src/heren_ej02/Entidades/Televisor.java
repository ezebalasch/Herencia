package heren_ej02.Entidades;

import java.util.ArrayList;
import java.util.Objects;

public class Televisor extends Electrodomesticos {

    private Integer pulgadas;
    private Boolean sintonizador;
    private ArrayList<Electrodomesticos> lista;
    private ArrayList<Double> suma;

    public Televisor() {
        this.lista = new ArrayList<>();
        this.suma = new ArrayList<>();

    }

    public Televisor(Integer pulgadas, Boolean sintonizador, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public Televisor crearTelevisor() {
        Televisor l1 = new Televisor();
        l1 = (Televisor) crearElectrodomestico(l1);
        System.out.println("----------------------------");
        System.out.println("Ingrese dato específico del Televisor");
        System.out.println("Ingrese sus pulgadas");
        l1.setPulgadas(leer.nextInt());
        System.out.println("Ingrese T o F para saber si tiene sintonizador");
        System.out.println("");
        Character sint = leer.next().charAt(0);
        validarBoolean(l1, sint);
        precioFinal(l1);
        agregarASuma(l1.getPrecio());

        return new Televisor(l1.getPulgadas(), l1.getSintonizador(), l1.getPrecio(), l1.getColor(), l1.getConsumo(), l1.getPeso());
    }
    
    public void agregarASuma(Double l1) {
        suma.add(l1);
    }

    public void agregarTele(Televisor l1) {
        lista.add(l1);
    }

    public Double recolectar() {
        double sumas = 0;

        for (Double aux : suma) {
            sumas += aux;
        }
        return sumas;
    }

    public void mostrarTeles() {
        System.out.println("");
        System.out.println("Los televisores ingresados son:");
        for (Electrodomesticos aux : lista) {
            System.out.println(aux);

        }
    }

    public void verificarPulgadas(Televisor l1) {
        if (l1.getPulgadas() > 40 && l1.getSintonizador() == true) {
            System.out.println("Incrementando precio en 30% por superar pulgadas");
            System.out.println("Incrementando precio $500+ por sintonizador");
            System.out.println("");
            l1.setPrecio((l1.getPrecio() + (l1.getPrecio() * 0.3)));
            l1.setPrecio(l1.getPrecio() + 500);

            System.out.println("Precio: " + l1.getPrecio());

        } else if (l1.getPulgadas() > 40) {
            System.out.println("Incrementando precio en 30% por superar pulgadas");
            l1.setPrecio((l1.getPrecio() + (l1.getPrecio() * 0.3)));
            System.out.println("Precio: " + l1.getPrecio());

        } else if (l1.getSintonizador() == true) {
            System.out.println("Incrementando precio $500+ por sintonizador");
            System.out.println("");
            l1.setPrecio(l1.getPrecio() + 500);
            System.out.println("Precio: " + l1.getPrecio());

        } else {
            System.out.println("Precio sin cambios, no se superan las 40 pulgadas ni se posee sintonizador");
        }

    }

    public void generado() {
        Televisor l1;
        int a = 0;
        do {
            l1 = crearTelevisor();
            agregarTele(l1);
            a++;
        } while (a < 2);
    }

    public void validarBoolean(Televisor l1, Character sint) {
        if (sint == 'T' || sint == 'F' || sint == 't' || sint == 'f') {
            System.out.println("Respuesta guardada");
            System.out.println("");
            if (sint == 'F' || sint == 'f') {
                l1.setSintonizador(false);
            } else {
                l1.setSintonizador(true);
            }

        } else {
            do {
                System.out.println("valor incorrecto");
                System.out.println("Ingrese T o F para saber si tiene sintonizador");
                System.out.println("");
                validarBoolean(l1, sint);
            } while (sint != 'T' && sint != 'F' && sint != 't' && sint != 'f');

        }
    }

    @Override
    public void precioFinal(Electrodomesticos l1) {
        verificarPulgadas((Televisor) l1);
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", color=" + getColor()
                + ", consumo=" + getConsumo() + ", peso=" + getPeso()
                + ", pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }

}
