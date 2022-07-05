/*
// Curso Egg FullStack
 */
package heren_ej02.Enumeraciones;

/**
 *
 * @author Ezequiel Balasch
 */
public enum ControlConsumo {
    A("A"), B("B"), C("C"), D("D"), E("E"), F("F");
    private final String valor;

    private ControlConsumo(String valor) {
        this.valor = valor;
    }

    public static ControlConsumo getA() {
        return A;
    }

    public static ControlConsumo getB() {
        return B;
    }

    public static ControlConsumo getC() {
        return C;
    }

    public static ControlConsumo getD() {
        return D;
    }

    public static ControlConsumo getE() {
        return E;
    }

    public static ControlConsumo getF() {
        return F;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor;
    }
    

    
    
}
