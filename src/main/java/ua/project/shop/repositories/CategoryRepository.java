package ua.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.project.shop.tables.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
