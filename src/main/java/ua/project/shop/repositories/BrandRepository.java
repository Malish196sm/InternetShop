package ua.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.project.shop.tables.Brand;

@Repository
public interface BrandRepository extends JpaRepository <Brand, Integer> {
}
