package heren_ej04.Entidades;




public class Circulo {
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
    

}
