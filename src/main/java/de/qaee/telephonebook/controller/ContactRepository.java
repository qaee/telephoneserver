package de.qaee.telephonebook.controller;

import de.qaee.telephonebook.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
