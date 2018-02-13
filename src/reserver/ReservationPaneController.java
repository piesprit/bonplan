/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserver;

import entité.Reservation;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import service.GestionReservation;

/**
 * FXML Controller class
 *
 * @author firas
 */
public class ReservationPaneController{
    ObservableList<String> comboHeureList = FXCollections.observableArrayList("1:00", "2:00", "3:00", "4:00", "5:00", "6:00", "7:00", "8:00", "9:00", "10:00", "11:00"
    , "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00");
    @FXML
    private TextField Nbrplace;
    @FXML
    private TextField telephone;
    @FXML
    private DatePicker dateReservation;
    private TextField heure;
    @FXML
    private Button btnReserver;
    @FXML
    private Button btnAnnuler;
    @FXML
    private ComboBox comboHeure;

    /**
     * Initializes the controller class.
     */
     
    
    @FXML
    public void initialize() {
        comboHeure.setValue("1:00");
        comboHeure.setItems(comboHeureList);
    }    
       
    @FXML
    private void AjouterReservation(ActionEvent event) {
        System.out.println("aa");

        GestionReservation sp = new GestionReservation();

        Reservation r = new Reservation(Integer.parseInt(Nbrplace.getText()),Integer.parseInt(telephone.getText()),(String)comboHeure.getValue());

        r.setDateReservation(java.sql.Date.valueOf(dateReservation.getValue()));
        System.out.println("houni houni rani houni");
 
        
        try {
            sp.ajouterReservation(r);
            System.out.println("Réservation ajouté avec succès !! ");
           
            
        } catch (SQLException ex) {
            Alert alert2 = new Alert(Alert.AlertType.WARNING);
            alert2.setTitle("Erreur");
            alert2.setContentText("réservation impossible!!!!!!");
            alert2.setHeaderText(null);
            alert2.show();
        } 
        
    }
    
    

    
}
