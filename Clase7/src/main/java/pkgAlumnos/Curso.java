package pkgAlumnos;

public class Curso {
    private String nombre;
    private int codigo;
    private double costo;

    //constructor
    public Curso(String nombre, int codigo, double costo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.costo = costo;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
