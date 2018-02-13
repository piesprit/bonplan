/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DataSource.DataSource;
import entité.Commentaire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author firas
 */
public class GestionCommentaire {
      Connection con = DataSource.getInstance().getConnection();
    private Statement ste;
    
    public GestionCommentaire() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
            int id = 1 ;

    public void ajouterCommentaire(Commentaire c) throws SQLException {
        String req = "INSERT INTO `avis` ( `commentaire`,`urlPhoto`,`user_iduser`) VALUES (?,?,?)";
        
        PreparedStatement pre = con.prepareStatement(req);
        pre.setString(1,c.getCommentaire());
        pre.setString(2, "photo.jpeg");
        pre.setInt(3, id);

        pre.executeUpdate();
        System.out.println("commentaire ajoutée!");
    }   
}
