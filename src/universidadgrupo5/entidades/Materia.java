/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5.entidades;

/**
 *
 * @author Asus
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria;
    private boolean activa;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anioMateria, boolean activa) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activa = activa;
    }

    public Materia(String nombre, int anioMateria, boolean activa) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.activa = activa;
    }

   
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isActiva() {
        return activa;
    }

    //G&S
    public void setActiva(boolean activa) {    
        this.activa = activa;
    }

    //ToString
    @Override
    public String toString() {
        return nombre +" "+ anioMateria;
    }

    
    
}
