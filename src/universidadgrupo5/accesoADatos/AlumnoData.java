
package universidadgrupo5.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import universidadgrupo5.entidades.Alumno;


public class AlumnoData {
    private Connection con=null;
    
    public AlumnoData(){
        con=Conexion.getCotexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                    + "VALUE(? ,? ,? ,? ,?)";
        
        try {       
            
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Alumno Agredado Exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
        
    }
    
    
    public void modificarAlumno (Alumno alumno){
        
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?"
                + "WHERE idAlumno = ? ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if( exito==1){
                JOptionPane.showMessageDialog(null, "Alumno Modificado");
            }       
            
            
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
    
     public void eliminarAlumno (int id){
        
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Alumno borrado");
            }
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
                 
    
    
}
     public Alumno  buscarAlumnoId (int id){
        //busca alumnos por ID y con el estado 1(activo)
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? and estado = 1";
        Alumno alumno =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);            
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();      
            if(rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
                
                //JOptionPane.showMessageDialog(null, "Alumno borrado");
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno con el ID indicado");
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;               
      }
     public Alumno  buscarAlumnoDni (int dni){
        //busca alumnos por ID y con el estado 1(activo)
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? and estado = 1";
        Alumno alumno =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);            
            ps.setInt(1, dni);
            ResultSet rs=ps.executeQuery();      
            if(rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                
                
                //JOptionPane.showMessageDialog(null, "Alumno borrado");
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno con el ID indicado");
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;               
      }
     
     public List<Alumno>  listarAlumnos (){
        //
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);            
            
            ResultSet rs=ps.executeQuery();      
            while(rs.next()){
                Alumno alumno=new Alumno();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
                alumnos.add(alumno);
                
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return   alumnos;            
      }
     
}
