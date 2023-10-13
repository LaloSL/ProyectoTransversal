/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo5;

import java.sql.Connection;
import universidadgrupo5.accesoADatos.Conexion;

/**
 *
 * @author Asus
 */
public class UniversidadGrupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=Conexion.getCotexion();
        
    }
    
}
