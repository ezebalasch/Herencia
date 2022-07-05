package heren_ej02.Entidades;

import heren_ej02.Enumeraciones.Arcoiris;
import heren_ej02.Enumeraciones.ControlConsumo;
import java.util.Scanner;

public abstract class Electrodomesticos {

    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String comprobarConsumoEnergetico(String letra, Electrodomesticos l1) {
        if (l1.getConsumo().toString().toUpperCase().equals(ControlConsumo.valueOf(letra).toString().toUpperCase())) {
            System.out.println("Consumo " + l1.getConsumo().toString().toUpperCase() + " validado correctamente");
            l1.setConsumo(consumo);
        } else {
            System.out.println("Consumo incompatible, se le asignará letra F");
            l1.setConsumo('F');
        }
        return letra;

    }

    public String comprobarColor(String color, Electrodomesticos l1) {
        if (l1.getColor().toUpperCase().equals(Arcoiris.valueOf(color).toString().toUpperCase())) {
            System.out.println("Color " + l1.getColor() + " validado correctamente");

        } else {
            System.out.println("Color incompatible, se le asignará el color Blanco");
            l1.setColor("Blanco");
        }
        return color;

    }

    public Electrodomesticos crearElectrodomestico(Electrodomesticos l1) {
        System.out.println("-------------------------------------");
        System.out.println("CARGANDO DATOS DEL ELECTRODOMÉSTICO");
        System.out.println("Ingrese el precio, recuerde que debe ser mayor a 1000");
        Double valor = leer.nextDouble();
        if (valor > 1000) {
            l1.setPrecio(valor);
        } else {
            do {
                System.out.println("Ingrese el precio");
                valor = leer.nextDouble();
            } while (valor < 1000);
            l1.setPrecio(valor);
        }
        System.out.println("Ingrese color");
        l1.setColor(leer.next().toUpperCase());
        l1.setColor(comprobarColor(l1.getColor(), l1));
        System.out.println("Ingrese consumo");
        l1.setConsumo(leer.next().charAt(0));
        l1.setConsumo(comprobarConsumoEnergetico(l1.getConsumo().toString().toUpperCase(), l1).charAt(0));
        System.out.println("Ingrese peso");
        l1.setPeso(leer.nextDouble());
        return l1;

    }


    public abstract void precioFinal(Electrodomesticos l1);

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", color=" + getColor() + ", consumo=" + getConsumo() + ", peso=" + getPeso() + '}';
    }

}
