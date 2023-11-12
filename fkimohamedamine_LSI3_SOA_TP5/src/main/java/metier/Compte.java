package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    double solde;
    String code;
    @XmlTransient
    Date dateCreation;

    //constructeur avec parametres
    public Compte(String code,double solde, Date dateCreation) {
        this.code=code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    //constructeur sans parametre
    public Compte() {
    }
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String toString() {
        return ("solde :"+ solde + "code: " + code + "date de creation :" + dateCreation);
    }

}