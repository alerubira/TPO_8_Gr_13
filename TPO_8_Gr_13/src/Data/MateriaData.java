/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Entidades.Alumno;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = ConeccionData.getConexion();

    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia (nombre, estado, año) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setBoolean(2, materia.isEstado());
            ps.setInt(3, materia.getAnio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setId_Materia(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia" + ex.getMessage());
        }

    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = "+idMateria+" AND estado = 1";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setId_Materia(rs.getInt(idMateria));
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(rs.getBoolean("estado"));
                materia.setAnio(rs.getInt("año"));
                
       //         alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
       //         alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia " + ex.getMessage());
        }

        return materia;
    }

}
