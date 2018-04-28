package de.qaee.telephonebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactNumber {

    @Id
    @GeneratedValue
    private Integer id;
    private String telephoneNumber;
    private enum TelphoneType {
        HOME,OFFICE
    }
    private TelphoneType telphoneType;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public TelphoneType getTelphoneType() {
        return telphoneType;
    }

    public void setTelphoneType(TelphoneType telphoneType) {
        this.telphoneType = telphoneType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
