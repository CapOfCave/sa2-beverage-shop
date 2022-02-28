package de.hswhameln.beverages.repositories;

import de.hswhameln.beverages.beans.Customer;
import de.hswhameln.beverages.projections.CustomerDefault;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CustomerDefault.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
