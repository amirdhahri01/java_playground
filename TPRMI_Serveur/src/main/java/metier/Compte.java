package metier;

import java.io.Serializable;
import java.util.Date;


public class Compte implements Serializable{
    private int code;
    private double sold;
    private Date dateCreation;
    private static final long serialVersionUID = 1859756106016105198L;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Compte(int code, double sold, Date dateCreation) {
        this.code = code;
        this.sold = sold;
        this.dateCreation = dateCreation;
    }
    
}
