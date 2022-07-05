/*
// Curso Egg FullStack
 */

package heren_ej01;

    //@author Ezequiel Bala
import heren_ej01.Entidades.Animal;
import heren_ej01.Entidades.Caballo;
import heren_ej01.Entidades.Gato;
import heren_ej01.Entidades.Perro;



public class Heren_ej01 {

    public static void main(String[] args) {
        Animal perro = new Perro("Stich", "Carne", 15, "Doberman");
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
        
       
    }

}
