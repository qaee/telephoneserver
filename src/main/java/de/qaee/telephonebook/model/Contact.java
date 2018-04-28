package de.qaee.telephonebook.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;
    private String email;
    @OneToMany( cascade = CascadeType.ALL)
    private List<ContactNumber> contactNumber;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
