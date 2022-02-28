package de.hswhameln.beverages.repositories;

import de.hswhameln.beverages.beans.Product;
import de.hswhameln.beverages.projections.ProductDefault;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = ProductDefault.class)
public interface ProductRepository extends JpaRepository<Product, Long> {

}
