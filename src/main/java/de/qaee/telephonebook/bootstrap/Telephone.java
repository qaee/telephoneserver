package de.qaee.telephonebook.bootstrap;

import de.qaee.telephonebook.model.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface  Telephone  extends PagingAndSortingRepository<Contact, Integer> {
    List<Contact>  findByLastName(@Param("name") String name);
}
