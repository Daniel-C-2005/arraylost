package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("001", "Juan Perez", "444", " 5 calle 8-14");
        alumno1.agregarCurso(new Curso("Programacion 1", 10, 500));
        alumno1.agregarCurso(new Curso("Derecho", 12, 1));
        System.out.println("Nombre del alumno: " + alumno1.getNombre());
        System.out.println("Carnet: " + alumno1.getCarnet());


        Alumno alumno2 = new Alumno("002", "Maria Lopez", "555", " 6 calle 8-14");
        alumno2.agregarCurso(new Curso("Programacion 2", 556, 600));
        alumno2.agregarCurso(new Curso("Matematicas 3", 557, 700));

        Alumno alumno3 = new Alumno("003", "Pedro Perez", "666", " 7 calle 8-14");
        alumno3.agregarCurso(new Curso("Estadistica 3", 558, 800));
        alumno3.agregarCurso(new Curso("Programacion 3", 559, 700));

        Alumno alumno4 = new Alumno("004", "Ana Perez", "777", " 8 calle 8-14");
        alumno4.agregarCurso(new Curso("Calculo 3", 560, 1000));
        alumno4.agregarCurso(new Curso("Programacion 2", 561, 700));

        System.out.println("Total del alumno 1"+alumno1.getTotal());
        System.out.println("Total del alumno 2"+alumno2.getTotal());
        System.out.println("Total del alumno 3"+alumno3.getTotal());
        System.out.println("Total del alumno 4"+alumno4.getTotal());

        //iterar sobre los cursos del alumno




        }
    }

