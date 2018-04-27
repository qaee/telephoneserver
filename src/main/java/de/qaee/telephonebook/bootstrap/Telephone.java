package de.qaee.telephonebook.bootstrap;

import de.qaee.telephonebook.controller.ContactService;
import de.qaee.telephonebook.controller.IContactService;
import de.qaee.telephonebook.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Telephone {

    IContactService contactService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value = "rest/contacts", method = RequestMethod.GET)
    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        Contact contact = new Contact();
        contact.setName("Qasim Ali");
        contact.setAddress("Josephsuburg str 4a");
        contacts.add(contact);
        return contacts;
    }
    @RequestMapping(value = "rest/contacts", method = RequestMethod.POST)
    public void addContact(Contact contact) {
        System.out.println(contactService);
    }
    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
