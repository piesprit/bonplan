/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DataSource.DataSource;
import entité.Visiteur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Monia
 */
public class GestionVisiteur {
    Connection con = DataSource.getInstance().getConnection();
    private Statement ste;
    
    public GestionVisiteur() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void ajouterVisiteur(Visiteur v) throws SQLException {
        String req = "INSERT INTO `user` ( `pseudo`, `email`,`password`,`nomVisiteur`,`prenomVisiteur`,`role`) VALUES (?,?,?,?,?,?)";
        PreparedStatement pre = con.prepareStatement(req);
        pre.setString(1,v.getPseudo());
        pre.setString(2, v.getEmail());
        pre.setString(3,v.getPassword());
        pre.setString(4,v.getNom());
        pre.setString(5,v.getPrenom());
        pre.setString(6,v.getRole());
        pre.executeUpdate();
        System.out.println("Visiteur ajoutée!");
}}
