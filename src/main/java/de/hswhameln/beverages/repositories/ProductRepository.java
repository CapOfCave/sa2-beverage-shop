package de.hswhameln.beverages.repositories;

import de.hswhameln.beverages.beans.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
