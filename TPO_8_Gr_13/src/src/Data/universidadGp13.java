
package Data;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class universidadGp13 {

   
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/universidad","root","");
             String sql="INSERT INTO alumno(nombre,apellido,dni,fechaNacimiento,estado) VALUES ('Ricardo','Argent',885865,'1964-01-19',true)";
            
            PreparedStatement ps=con.prepareStatement(sql);
            int resultado=ps.executeUpdate();
            if(resultado>0){
            
                JOptionPane.showMessageDialog(null,"Alumno agregado");
            }else {
            
                JOptionPane.showMessageDialog(null,"Error al agregar alumno");
            }
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Drivers");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la BD");
        }

    }
    
}
