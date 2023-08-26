package pkgAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String carnet;
    private String direccion;
    private String telefono;
    private List<Curso> cursos;

    //Constructor
    public Alumno(String carnet, String nombre, String telefono, String direccion){
        this.carnet=carnet;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
    }
public double getTotal() {
    double t = 0;
    for (Curso curso : cursos) {
        t += curso.getCosto();
    }
    return t;
}
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }

    //Getters and Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
