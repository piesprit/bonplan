/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonplan;

import entité.Proprietaire;
import java.io.IOException;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.GestionProprietaire;

/**
 *
 * @author Ali
 */
public class FXMLDocumentController{
    ObservableList<String> tfCategorieList = FXCollections.observableArrayList("Hotêl", "Café", "Bar");
    
    private Label label;
    @FXML
    private TextField tfPseudo;
    @FXML
    private TextField tfMail;
    @FXML
    private PasswordField tfPwd;
    @FXML
    private TextField tfNomPlan;
    @FXML
    private TextField tfAdresse;
    @FXML
    private TextField tfTel;
    @FXML
    private TextField tfDesc;    
    @FXML
    private ChoiceBox tfCategorie;
    
    
    @FXML
    private Button btnSinscrire;
    @FXML
    private Button retourbtn;
    
    /*private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }*/
    
    public void initialize() {
        // TODO
        tfCategorie.setValue("Hotêl");
        tfCategorie.setItems(tfCategorieList);
    }    
    
    
    
    @FXML
    private void addMethod(ActionEvent event) {
        
        String pseudop = tfPseudo.getText();
        String mailp = tfMail.getText();
        String passwordp = tfPwd.getText();
        String nomp = tfNomPlan.getText();
        String adressep = tfAdresse.getText();
        String telp = tfTel.getText();
        String descp=tfDesc.getText();
        String photoP="photo.jpg";
        String categp=(String) tfCategorie.getValue();
        Proprietaire p = new Proprietaire(pseudop, mailp, passwordp, photoP, nomp, adressep, telp, descp, categp, "Propiétaire");
        GestionProprietaire sp = new GestionProprietaire();
                
            if (tfPwd.getText().length()==0){
                Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Erreur");
            alert2.setContentText("saisir un mot de passe");
            alert2.setHeaderText(null);
            alert2.show();
            }else{
        try {
            
            sp.ajouterProprietaire(p);
            System.out.println("Propriétaire ajouté avec succès !! ");
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
    }
    
    @FXML
    private void btnRetour(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/authentification/verificationFXML.fxml"));
        Parent root = loader.load();
        retourbtn.getScene().setRoot(root);
    }
}
