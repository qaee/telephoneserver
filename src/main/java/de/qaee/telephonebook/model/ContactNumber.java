package de.qaee.telephonebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ContactNumber implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String telephoneNumber;
    /*
    private enum TelephoneType {
        HOME,OFFICE
    }*/

    private String string;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
