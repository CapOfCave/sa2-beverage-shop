package de.hswhameln.beverages.repositories;

import de.hswhameln.beverages.beans.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
