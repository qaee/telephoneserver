package de.qaee.telephonebook.control;

import de.qaee.telephonebook.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
@CrossOrigin( origins = "*")
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}
