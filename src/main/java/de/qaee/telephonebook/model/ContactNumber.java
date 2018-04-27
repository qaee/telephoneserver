package de.qaee.telephonebook.model;

import java.io.Serializable;

public class ContactNumber implements Serializable {

    private int id;
    private String telephoneNumber;
    private Telephonetype telephoneType;

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Telephonetype getTelephoneType() {
        return telephoneType;
    }

    public void setTelephoneType(Telephonetype telephoneType) {
        this.telephoneType = telephoneType;
    }

    public Telephonetype[] getAllTypes() {
        return Telephonetype.values();
    }
    public enum Telephonetype {
        HOME, OFFICE;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

