/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package losclavos;

import modelo.Conexion;

/**
 *
 * @author jared
 */
public class LosClavos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.getConexion();
    }
    
}
