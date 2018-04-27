package de.qaee.telephonebook.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private int id;
    private String address;
    private String name;
    private List<ContactNumber> contactNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContactNumber> getContactNumber() {
        if(contactNumber == null) {
            contactNumber = new ArrayList<>();
        }
        return contactNumber;
    }

    public void setContactNumber(List<ContactNumber> contactNumber) {
        this.contactNumber = contactNumber;
    }
}
