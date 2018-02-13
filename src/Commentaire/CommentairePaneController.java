/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commentaire;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import service.GestionCommentaire;
import entité.Commentaire;

/**
 * FXML Controller class
 *
 * @author firas
 */
public class CommentairePaneController implements Initializable {

    @FXML
    private TextArea textcommentaire;
    @FXML
    private Button btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajoutezCommentaire(ActionEvent event) {
        
         System.out.println("aa");

        GestionCommentaire sp = new GestionCommentaire();

        Commentaire r = new Commentaire(textcommentaire.getText());

        System.out.println("houni houni rani houni");
 
        
        try {
            sp.ajouterCommentaire(r);
            System.out.println("commentaire ajouté avec succès !! ");
           
            
        } catch (SQLException ex) {
            Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Erreur");
            alert2.setContentText("commentaire impossible!!!!!!");
            alert2.setHeaderText(null);
            alert2.show();
        } 
        
    }
    
}
