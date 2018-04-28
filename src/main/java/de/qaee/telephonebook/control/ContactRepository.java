package de.qaee.telephonebook.control;

import de.qaee.telephonebook.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contact")
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
