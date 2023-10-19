
package universidadgrupo5.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo5.entidades.Alumno;
import universidadgrupo5.entidades.Inscripcion;
import universidadgrupo5.entidades.Materia;

public class InscripcionData {
    
    private Connection con=null;
    private MateriaData md=new MateriaData();
    private AlumnoData ad=new AlumnoData();
    
    public InscripcionData(){
        con=Conexion.getCotexion();
    }
    public void guardarInscripcion (Inscripcion insc){
    
    String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            insc.setIdInscripcion(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Inscripción Correcta");
            }
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }
    
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
        String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas=ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }
        
    }
    
    public void borrarInscripcion(int idAlumno, int idMateria){
        String sql="DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas=ps.executeUpdate();
            if(filas>0){
               
                JOptionPane.showMessageDialog(null, "Inscripcion Eliminada");

            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción");
        }
        
    }
    
    public List<Inscripcion>  obtenerInscripciones (){
               
        ArrayList<Inscripcion> inscriptas=new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);            
            
            ResultSet rs=ps.executeQuery();  
            
            while(rs.next()){
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu=ad.buscarAlumnoId(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateriaId(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));                
                inscriptas.add(insc);
                
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
        return   inscriptas;            
      }
    
    public List<Inscripcion>  obtenerInscripcionesPorAlumno (int idAlumno){
               
        ArrayList<Inscripcion> inscriptas=new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setInt(1,idAlumno);
            ResultSet rs=ps.executeQuery();  
            
            while(rs.next()){
                Inscripcion insc=new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu=ad.buscarAlumnoId(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateriaId(rs.getInt("idMateria"));
                insc.setAlumno(alu);
                insc.setMateria(mat);
                insc.setNota(rs.getDouble("nota"));                
                inscriptas.add(insc);
                
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
        return   inscriptas;            
      }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
      ArrayList<Materia> materias=new ArrayList<>();
      //producto cartesiano
      String sql="SELECT inscripcion.idMateria, nombre, año " +
             "FROM inscripcion, materia " +
             "WHERE inscripcion.idMateria = materia.idMateria " +
             "AND inscripcion.idAlumno = ?";
      

        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas (int idAlumno){
        ArrayList <Materia> materias=new ArrayList<>();
         String sql = "SELECT * FROM materia "//son importantes los espacios en el STRING de sql
           + "WHERE estado=1 AND idMateria NOT IN"
           //subconsulta
           //id de todas las materias en las que esta inscripto un alumno
           + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
       

                      
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
        return materias;
    }
    
    public List <Alumno> obtenerAlumnosXMateria(int idMateria){
        ArrayList<Alumno> alumnosMateria= new ArrayList<>();
         String sql="SELECT a.idAlumno,dni, nombre, apellido, fechaNacimiento, estado"
                 + " FROM inscripcion i, alumno a WHERE i.idAlumno=a.idAlumno AND idMateria=? AND a.estado=1";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
               Alumno alumno=new Alumno();
               alumno.setIdAlumno(rs.getInt("idAlumno"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumno.setActivo(rs.getBoolean("estado"));
               alumnosMateria.add(alumno);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");     
        }
         
       return alumnosMateria;
            
    }        
}
    
    

