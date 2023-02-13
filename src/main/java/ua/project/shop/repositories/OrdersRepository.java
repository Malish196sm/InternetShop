package ua.project.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.project.shop.tables.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
