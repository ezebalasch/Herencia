package heren_ej02.Entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Lavadora extends Electrodomesticos {

    private Integer carga;
    private ArrayList<Electrodomesticos> lista;
    private ArrayList<Double> suma;

    public Lavadora() {
        this.lista = new ArrayList<>();
        this.suma = new ArrayList<>();

    }

    public Lavadora(Integer carga, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora crearLavadora() {
        Lavadora l1 = new Lavadora();
        l1 = (Lavadora) crearElectrodomestico(l1);
        System.out.println("----------------------------");
        System.out.println("Ingrese dato específico de la Lavadora");
        System.out.println("Ingrese su carga");
        System.out.println("");
        l1.setCarga(leer.nextInt());
        precioFinal(l1);
        agregarASuma(l1.getPrecio());
        return new Lavadora(l1.getCarga(), l1.getPrecio(), l1.getColor(), l1.getConsumo(), l1.getPeso());
    }

    public void agregarASuma(Double l1) {
        suma.add(l1);
    }

    public Double recolectar() {
        double sumas = 0;
        
        for (Double aux : suma) {
            sumas += aux;
        }
        return sumas;
    }

    public void agregarLavadora(Lavadora l1) {
        lista.add(l1);
    }

    public void generado() {
        Lavadora l1;
        int a = 0;
        do {
            l1 = crearLavadora();
            agregarLavadora(l1);
            a++;
        } while (a < 2);
    }

    public void mostrarLista() {
        System.out.println("");
        System.out.println("Las lavadoras ingresadas son:");

        for (Electrodomesticos aux : lista) {
            System.out.println(aux.toString());
        }
    }

    @Override
    public void precioFinal(Electrodomesticos l1) {
        if (l1.getPeso() > 30) {
            l1.setPrecio((l1.getPrecio() + 500));
            System.out.println("El precio nuevo es " + l1.getPrecio());
            System.out.println("");
        } else {
            System.out.println("Su precio quedó en " + l1.getPrecio());
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + getColor() + ", consumo=" + getConsumo() + ", peso=" + getPeso() + ", carga=" + carga + '}';
    }

}
