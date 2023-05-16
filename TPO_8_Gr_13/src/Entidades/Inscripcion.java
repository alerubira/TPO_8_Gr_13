/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Gabriel
 */
public class Inscripcion {
    private int idInscripcion;
    private int idAlumno;
    private int idMateria;
    private int nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, int idAlumno, int idMateria, int nota) {
        this.idInscripcion = idInscripcion;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripcion=" + idInscripcion + ", idAlumno=" + idAlumno + ", idMateria=" + idMateria + ", nota=" + nota + '}';
    }
    
    
}
