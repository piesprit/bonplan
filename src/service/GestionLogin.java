/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DataSource.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.Alert;

/**
 *
 * @author Ali
 */
public class GestionLogin {

    static DataSource ds = DataSource.getInstance();

    public static Boolean recherche(String login, String mdp) {
        Statement ste1;
        try {
            ste1 = ds.getConnection().createStatement();
            String req = "SELECT * FROM USER WHERE PSEUDO='" + login + "'AND PASSWORD ='" + mdp + "'";
            ResultSet rs = ste1.executeQuery(req);
            while (rs.next()) {
                System.out.println("authentification effectuer avec succès !! ");
                return true;
            }

        } catch (SQLException ex) {
            Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Erreur");
            alert2.setContentText("Veillez vérifier votre nom d'utilisateur et mot de passe");
            alert2.setHeaderText(null);
            alert2.show();
        }
        return false;
    }
}
