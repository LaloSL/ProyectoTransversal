/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo5.accesoADatos.AlumnoData;
import universidadgrupo5.accesoADatos.Conexion;
import universidadgrupo5.entidades.Alumno;

/**
 *
 * @author Asus
 */
public class UniversidadGrupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Alumno joaquin= new Alumno(37, 1231231231, "Ortega", "Joaco", LocalDate.of(1990, 5, 5), true);
       // AlumnoData alu= new AlumnoData();
       // alu.guardarAlumno(joaquin);
       //alu.modificarAlumno(joaquin);
       //alu.eliminarAlumno(37);
       
      //Alumno alumnoEncontrado=alu.buscarAlumnoId(36);
        //System.out.println(alumnoEncontrado.toString());
       
        // Alumno alumnoEncontrado=alu.buscarAlumnoDni(12345672);
        //System.out.println(alumnoEncontrado.toString());
        
       AlumnoData alu=new AlumnoData();
       for (Alumno alumno:alu.listarAlumnos()){
           System.out.println(alumno.getDni());           
           System.out.println(alumno.getApellido());
           System.out.println(alumno.getNombre());
           System.out.println(alumno.getFechaNac());
       }
       
       
       
        
    }
    
}
