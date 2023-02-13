package ua.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.project.shop.tables.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
