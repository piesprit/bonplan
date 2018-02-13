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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import service.GestionLogin;

/**
 * FXML Controller class
 *
 * @author Ali
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btn;
    @FXML
    private Label label;
    @FXML
    private TextField login;
    @FXML
    private PasswordField mdp;
    @FXML
    private Label lbl;
    @FXML
    private Button inscrivezvousbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLoginAction(ActionEvent event) {
        String m = login.getText();
        GestionLogin ser = new GestionLogin();
        if (GestionLogin.recherche(login.getText(), mdp.getText())) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/authentification/accueilFXML.fxml"));
            System.out.println("dkhal");
            try {
                Parent root = loader.load();
                IntVisitController af = loader.getController();
                af.setLogin(m);
                login.getScene().setRoot(root);
            } catch (IOException ex) {
                System.out.println("5raj");
            }
        } else {
            Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Erreur");
            alert2.setContentText("Veillez vérifier votre mot de passe");
            alert2.setHeaderText(null);
            alert2.show();
        }

    }
    
    @FXML
    private void btninscription(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/authentification/verificationFXML.fxml"));
        Parent root = loader.load();
        inscrivezvousbtn.getScene().setRoot(root);
    }

}
