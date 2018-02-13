/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentification;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class VerificationFXMLController implements Initializable {
    
    @FXML
    private Button btnV;
    @FXML
    private Button btnP;
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
    private void btnRetour(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/authentification/authentificationFXML.fxml"));
        Parent root = loader.load();
        retourbtn.getScene().setRoot(root);
    }
    
    @FXML
    public void showVisiteur (ActionEvent event) throws IOException{
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/loginagain/inscrit.fxml"));
        Parent root = loader.load();
        btnV.getScene().setRoot(root);
    }
    
     @FXML
    public void showProprietaire (ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/bonplan/FXMLDocument.fxml"));
        Parent root = loader.load();
        btnP.getScene().setRoot(root);
    }
    
    
    
    
}
