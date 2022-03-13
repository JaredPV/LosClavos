/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jared
 */
public class MDB extends Conexion {

    public boolean inicioSesion (Usuario u){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "SELECT * FROM usuario WHERE numeroEmpleado=? AND pass=? LIMIT 1";
        try{
            ps = con.prepareCall(sql);
            ps.setInt(1, u.getNumeroEmpleado());
            ps.setString(2, u.getPass());
            rs = ps.executeQuery();
            if (rs.next()){
                u.setNumeroEmpleado(Integer.parseInt(rs.getString("numeroEmpleado")));
                u.setPass(rs.getString("pass"));
                return true;
            }
            return false;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
}
