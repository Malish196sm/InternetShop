package ua.project.shop.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
@Entity(name = "Order")
@Table(name = "order")
public class Order {
    @Id
    @SequenceGenerator(name = "sequence_order_id",
            sequenceName = "sequence_order_id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_order_id")
    @Column(name = "order_id")
    private int id;
    @Column(
            name = "product_id",
            nullable = false)
    private int productId;
    @Column(
            name = "price",
            nullable = false)
    private double price;
    @Column(
            name = "quantity",
            nullable = false)
    private int quantity;
    @Column(
            name = "order_sum",
            nullable = false)
    private double orderSum;
    @Column(
            name = "order_date",
            nullable = false)
    private LocalDateTime orderDate;
    @Column(
            name = "customer_id",
            nullable = false)
    private int customerId;

    public LocalDateTime getOrderDate() {
        return LocalDateTime.now();
    }

    public double getOrderSum() {
        return this.orderSum = this.quantity * this.price;
    }
}
