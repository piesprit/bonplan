/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginagain;

import entité.Visiteur;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.GestionVisiteur;

/**
 * FXML Controller class
 *
 * @author Monia
 */
public class InscritController implements Initializable {

    @FXML
    private TextField pseudo;
    @FXML
    private TextField prenom;
    @FXML
    private TextField nom;
    @FXML
    private TextField mail;
    @FXML
    private PasswordField pass;
    @FXML
    private Button btn;
    @FXML
    private Button retourbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterV(ActionEvent event) {
    String pseudov = pseudo.getText();
        String mailv = mail.getText();
        String password = pass.getText();
        String nomv = nom.getText();
        String prenomv = prenom.getText();
        
       
        Visiteur v = new Visiteur (pseudov, mailv, password, nomv, prenomv , "Visiteur");
        //Proprietaire p = new Personne(nomp, prenomp);
        GestionVisiteur sp = new GestionVisiteur();
        try {
            sp.ajouterVisiteur(v);
            System.out.println("visiteur ajouté avec succès !! ");
            /*FXMLLoader fx = new FXMLLoader(getClass().getResource("ResultMe.fxml"));
            Parent root = fx.load();*/
            
        } catch (SQLException ex) {
            Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Erreur");
            alert2.setContentText("Inscription impossible");
            alert2.setHeaderText(null);
            alert2.show();
        } 
    }
    
    @FXML
    private void btnRetour(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/authentification/verificationFXML.fxml"));
        Parent root = loader.load();
        retourbtn.getScene().setRoot(root);
    }
    }
    

