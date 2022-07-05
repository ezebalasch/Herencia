package heren_ej02;

import heren_ej02.Entidades.Lavadora;
import heren_ej02.Entidades.Televisor;

/*
// Curso Egg FullStack
 */
//@author Ezequiel Balasch
public class Heren_ej02 {

    public static void main(String[] args) {

        Lavadora l1 = new Lavadora();
        l1.generado();

        Televisor l2 = new Televisor();
        l2.generado();

        l1.mostrarLista();
        l2.mostrarTeles();

        int a = 0;
        do {
            Double suma = l1.recolectar() + l2.recolectar();

            a++;
            System.out.println("La suma de los precios es:");
            System.out.println(suma);

        } while (a == 0);
    }

}


