/*
// Curso Egg FullStack
 */
package heren_ej02.Enumeraciones;

/**
 *
 * @author Ezequiel Balasch
 */
public enum Arcoiris {
    BLANCO("BLANCO"), NEGRO("NEGRO"), ROJO("ROJO"), AZUL("AZUL"), GRIS("GRIS");
    private final String valor;

    private Arcoiris(String valor) {
        this.valor = valor;
    }

    public static Arcoiris getBLANCO() {
        return BLANCO;
    }

    public static Arcoiris getNEGRO() {
        return NEGRO;
    }

    public static Arcoiris getROJO() {
        return ROJO;
    }

    public static Arcoiris getAZUL() {
        return AZUL;
    }

    public static Arcoiris getGRIS() {
        return GRIS;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  valor;
    }
    
    
    
}
