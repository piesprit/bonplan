/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entité;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author firas
 */
public class Reservation {
    
    
    private int nbrPlace;
    private Date dateReservation;
    private int telephone;
    private String heure;

    public Reservation() {
    }

    public Reservation(int nbrPlace, int telephone, String heure) {
        this.nbrPlace = nbrPlace;
        this.telephone = telephone;
        this.heure = heure;
    }

    public Reservation(int nbrPlace, Date dateReservation, int telephone, String heure) {
        this.nbrPlace = nbrPlace;
        this.dateReservation = dateReservation;
        this.telephone = telephone;
        this.heure = heure;
    }

    public int getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(int nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }
    
    
}
