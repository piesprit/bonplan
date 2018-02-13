/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DataSource.DataSource;
import entité.Proprietaire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ali
 */
public class GestionProprietaire {
    Connection con = DataSource.getInstance().getConnection();
    private Statement ste;
    
    public GestionProprietaire() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void ajouterProprietaire(Proprietaire p) throws SQLException {
        String req = "INSERT INTO `user` ( `pseudo`, `email`,`password`,`photoProfil`,`nomPlan`,`adresse`,`telephone`,`description`,`categorie`,`role`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pre = con.prepareStatement(req);
        pre.setString(1,p.getPseudo());
        pre.setString(2, p.getEmail());
        pre.setString(3,p.getPassword());
        pre.setString(4,p.getPhotoProfil());
        pre.setString(5,p.getNomPlan());
        pre.setString(6,p.getAdresse());
        pre.setString(7,p.getTelephone());
        pre.setString(8,p.getDescription());
        pre.setString(9,p.getCategorie());
        pre.setString(10,p.getRole());
        pre.executeUpdate();
        System.out.println("Personne ajoutée!");
    }   
}
