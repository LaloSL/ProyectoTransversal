// Clase MateriaData
 
package universidadgrupo5.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo5.entidades.Materia;

/**
 *
 * @author Joaco
 */
public class MateriaData {
      
    private Connection con=null;
    
    public MateriaData(){
        con=Conexion.getCotexion();
    }
    
    public void guardarMateria(Materia materia){
       if(materia.getIdMateria()== 0){
        String sql="INSERT INTO materia (nombre, año, estado)"
                    + "VALUE(? ,? ,?)";
        
        
        try {            
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActiva());
            ps.executeUpdate();
             
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Materia agregada correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        
        
        }else{
            String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());            
            ps.setBoolean(3, materia.isActiva());
            ps.setInt(4, materia.getIdMateria());
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Materia modificada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la materia");
     }
        }

    

}
  
    
//------------------------------------------------------------------------------    
    
//    public void modificarMateria (Materia materia){
//        
//        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
//                
//        try {
//            PreparedStatement ps= con.prepareStatement(sql);
//            ps.setString(1, materia.getNombre());
//            ps.setInt(2, materia.getAnioMateria());            
//            ps.setInt(3, materia.getIdMateria());
//            ps.setBoolean(4, materia.isActiva());
//           
//            int ok = ps.executeUpdate();
//            if( ok == 1){
//                
//                JOptionPane.showMessageDialog(null, "Materia Modificada");
//            }       
//                   
//        
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
//        }
//        
//  }

//------------------------------------------------------------------------------    
     public void eliminarMateria (int idMateria){
        
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Materia Eliminada");
            }
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
                 
    
    
}
     
//------------------------------------------------------------------------------     
     public Materia  buscarMateriaId (int id){
        //busca materias por ID 
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";
        Materia materia =null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);            
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();      
            if(rs.next()){
                materia =new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));                
                int estado = rs.getInt("estado");//muestra el estado en el radio button
                materia.setActiva(estado == 1);                
                
                //JOptionPane.showMessageDialog(null, "Alumno borrado");
            }else{
                JOptionPane.showMessageDialog(null, "No existe la materia con el ID indicado");
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
        return materia;               
      }
     
//------------------------------------------------------------------------------     
     public List<Materia>  listarMaterias (){
        //
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE estado = 1";
        ArrayList<Materia> materias=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);            
            
            ResultSet rs=ps.executeQuery();      
            while(rs.next()){
                Materia materia=new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setActiva(true);
                materias.add(materia);
                
            }
            ps.close();
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return   materias;            
      }
     
}
 

