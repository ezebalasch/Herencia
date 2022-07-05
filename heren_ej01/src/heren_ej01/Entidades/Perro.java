package heren_ej01.Entidades;




public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    @Override
    public void Alimentarse() {
        System.out.println(nombre+" se alimenta de "+alimento);
    }
    

}
