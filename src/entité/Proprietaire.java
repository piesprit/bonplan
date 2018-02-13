/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entité;

import java.util.Objects;

/**
 *
 * @author Ali
 */
public class Proprietaire {
    private String pseudo;
    private String email;
    private String password;
    private String photoProfil;
    private String nomPlan;
    private String adresse;
    private String telephone;
    private String description;
    private String categorie;
    private String role;
    
    //constructeur :
    public Proprietaire() {
    }
    
    public Proprietaire(String pseudo, String email, String password, String photoProfil, String nomPlan, String adresse, String telephone, String description, String categorie, String role) {
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.photoProfil = photoProfil;
        this.nomPlan = nomPlan;
        this.adresse = adresse;
        this.telephone = telephone;
        this.description = description;
        this.categorie = categorie;
        this.role = role;
    }
    //get & set :

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        
           this.password = password; 
       
    }

    public String getPhotoProfil() {
        return photoProfil;
    }

    public void setPhotoProfil(String photoProfil) {
        this.photoProfil = photoProfil;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
  // Méthode ToString :
    @Override
    public String toString() {
        return "Proprietaire{" + "pseudo=" + pseudo + ", email=" + email + ", password=" + password + ", photoProfil=" + photoProfil + ", nomPlan=" + nomPlan + ", adresse=" + adresse + ", telephone=" + telephone + ", description=" + description + ", categorie=" + categorie + ", role=" + role + '}';
    }

    @Override
    public int hashCode() {
        int hash = 0 ;
        hash = 125 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proprietaire other = (Proprietaire) obj;
        return Objects.equals(this.password, other.password);
    }

    
    
    
}
