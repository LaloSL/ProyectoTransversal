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
import universidadgrupo5.accesoADatos.MateriaData;
import universidadgrupo5.entidades.Alumno;
import universidadgrupo5.entidades.Materia;

/**
 *
 * @author Asus
 */
public class UniversidadGrupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Guardar Alumno
       //Alumno joaquin= new Alumno(37, 1231231231, "Ortega", "Joaquin", LocalDate.of(1990, 5, 5), true);
       // AlumnoData alu= new AlumnoData();
       // alu.guardarAlumno(joaquin);
       
       //Modificar Alumno
//         Alumno joaquin= new Alumno(37, 1231231231, "Ortega", "Joaco", LocalDate.of(1990, 5, 5), true);
//         AlumnoData alu= new AlumnoData();
//       alu.modificarAlumno(joaquin);
//       
//       //Eliminar Alumno
//        Alumno joaquin= new Alumno(37, 1231231231, "Ortega", "Joaco", LocalDate.of(1990, 5, 5), true);
//       AlumnoData alu= new AlumnoData();
//       alu.eliminarAlumno(37);
       
       //Buscar por ID
//       AlumnoData alu= new AlumnoData();
//      Alumno alumnoEncontrado=alu.buscarAlumnoId(36);
//        System.out.println(alumnoEncontrado.toString());
       
        //Buscar por DNI
        // Alumno alumnoEncontrado=alu.buscarAlumnoDni(12345672);
        //System.out.println(alumnoEncontrado.toString());
        
        
//        //Listar todos los alumnos
//       AlumnoData alu=new AlumnoData();
//       for (Alumno alumno:alu.listarAlumnos()){
//           System.out.println(alumno.getDni());           
//           System.out.println(alumno.getApellido());
//           System.out.println(alumno.getNombre());
//           System.out.println(alumno.getFechaNac());
//       }
       
        
    
    //Agregar materia
//    Materia EDA = new Materia("EDA",2022, true);
//    MateriaData mat = new MateriaData();
//    mat.guardarMateria(EDA);

    
//    Modificar materia
//     Materia EDA = new Materia(32, "EDA",2023, true);
//    MateriaData mat = new MateriaData();
//    mat.modificarMateria(EDA);
    
//    Materia Laboratortio1 = new Materia(31, "Laboratorio1",2023, true);
//    MateriaData mat = new MateriaData();
//    mat.modificarMateria(Laboratortio1);
    
//      Eliminar Materia
//         Materia Laboratortio1 = new Materia(31, "Laboratorio1",2023, true);
//         MateriaData mat = new MateriaData();
//         mat.eliminarMateria(31);
//    
        //Buscar Materia por ID
//        MateriaData mat= new MateriaData();
//        Materia materiaEncontrada = mat.buscarMateriaId(30);
//        System.out.println(materiaEncontrada.toString());

        ////Listar todos las Materias
       MateriaData mat=new MateriaData();
       for (Materia materia:mat.listarMaterias()){
           System.out.println(materia.getIdMateria());           
           System.out.println(materia.getNombre());
           System.out.println(materia.getAnioMateria());
           
       }

    
    


}
}
