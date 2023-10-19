/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo5.accesoADatos.*;
import universidadgrupo5.entidades.*;


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
       // en este creo que no hace falta el idAlumno
       //Alumno joaquin= new Alumno(37, 1231231231, "Ortega", "Joaquin", LocalDate.of(1990, 5, 5), true);
      // creo un objeto Alumno data que me permite guardar en la BD
//        AlumnoData alu= new AlumnoData();
//        alu.guardarAlumno(joaquin);
       
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
//    Materia Matematica = new Materia("Matematica",2023, true);
//    //Materia EDA = new Materia("EDA",2022, true);
//    MateriaData mat = new MateriaData();
//    mat.guardarMateria(Matematica);

    
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
//       MateriaData mat=new MateriaData();
//       for (Materia materia:mat.listarMaterias()){
//           System.out.println(materia.getIdMateria());           
//           System.out.println(materia.getNombre());
//           System.out.println(materia.getAnioMateria());
//           
//       }
            //Guardar Inscripción
//            AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
////            
//            Alumno gabriel=ad.buscarAlumnoId(1);
//            Materia Laboratortio1=md.buscarMateriaId(2);
//            Inscripcion insc=new Inscripcion(gabriel,Laboratortio1,8);
//            
//            id.guardarInscripcion(insc);
            
            
            
            //Actualizar Nota
//            AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
//            Alumno gabriel=ad.buscarAlumnoId(35);
//            Materia eda=md.buscarMateriaId(32);
//            Inscripcion insc=new Inscripcion(gabriel,eda,9);
//            
//            id.actualizarNota(35, 32, 7);
            
            
//            Eliminar Inscripción
//             AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
//            Alumno gabriel=ad.buscarAlumnoId(35);
//            Materia eda=md.buscarMateriaId(32);
//            Inscripcion insc=new Inscripcion(gabriel,eda,9);
//            id.borrarInscripcion(36, 29);
            
            
            
            //listar inscripciones
//             AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
////            Alumno gabriel=ad.buscarAlumnoId(35);
////            Materia eda=md.buscarMateriaId(26);
////            Inscripcion insc=new Inscripcion();
//            //aca define el void
//            for(Inscripcion inscripcion:id.obtenerInscripciones()){
//                
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
//            System.out.println("Materia "+inscripcion.getMateria().getNombre());
//            
//              
//            }

///OBTENER INSCRIPCIONES POR ALUMNO
//            AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
//            for(Inscripcion inscripcion:id.obtenerInscripcionesPorAlumno(35)){
//                
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
//            System.out.println("Materia "+inscripcion.getMateria().getNombre());
//            
//              
//            }
            
// OBTENER MATERIAS CURSADA

//             AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
//            for(Materia materia: id.obtenerMateriasCursadas(35)){
//                
//            System.out.println("id "+materia.getIdMateria());
//            System.out.println("Materia "+materia.getNombre());
//            System.out.println("Año "+materia.getAnioMateria());
//            
//              
//            }
//OBTENER MATERIAS NO CURSADAS
//             AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
//            for(Materia materia: id.obtenerMateriasNoCursadas(35)){
//                
//            System.out.println("id "+materia.getIdMateria());
//            System.out.println("Materia "+materia.getNombre());
//            System.out.println("Año "+materia.getAnioMateria());
//
//            }


//OBTENER ALUMNO POR MATERIA
//
//            AlumnoData ad=new AlumnoData();
//            MateriaData md=new MateriaData();
//            InscripcionData id=new InscripcionData();
//            
//            for(Alumno alumno: id.obtenerAlumnosXMateria(26)){
//                
//            System.out.println("id "+alumno.getIdAlumno());
//            System.out.println("Apellido "+alumno.getApellido());
//            System.out.println("Nombre "+alumno.getNombre());
//            
//              
//            }

    



    }}

