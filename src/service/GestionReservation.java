/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DataSource.DataSource;
import entité.Proprietaire;
import entité.Reservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author firas
 */
public class GestionReservation {
    
    
       Connection con = DataSource.getInstance().getConnection();
    private Statement ste;

    public GestionReservation() {
               try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
               
               
    }
    String etat = "en cours";
    int id = 3;
        public void ajouterReservation(Reservation v) throws SQLException {
        String req = "INSERT INTO `reservation` (`nbrPlace`,`date`,`etat`,`user_iduser`,`telephone`,`heure`) VALUES (?,?,?,?,?,?)";
        
        PreparedStatement pre = con.prepareStatement(req);
        pre.setInt(1, v.getNbrPlace());
        pre.setDate(2, v.getDateReservation());
        pre.setString(3,etat);
        pre.setInt(4, id);
        pre.setInt(5, v.getTelephone());
        
        pre.setString(6, v.getHeure());
        pre.executeUpdate();
        System.out.println("Réservation ajoutée!");
    }  
}
