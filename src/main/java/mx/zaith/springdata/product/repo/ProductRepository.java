package mx.zaith.springdata.product.repo;

import org.springframework.data.repository.CrudRepository;

import mx.zaith.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
