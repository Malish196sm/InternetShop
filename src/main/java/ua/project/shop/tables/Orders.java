package ua.project.shop.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity(name = "Orders")
@Table(name = "orders")
public class Orders {
    @Id
    @SequenceGenerator(name = "sequence_order_id",
            sequenceName = "sequence_order_id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_order_id")
    @Column(name = "order_id")
    private int orderId;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "product_id", nullable = false)
    private Product productId;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "price", nullable = false)
    private Product price;
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
    private LocalDate orderDate;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerId;
    public LocalDate getOrderDate() {
        return LocalDate.now();
    }

    public double getOrderSum() {
        return orderSum = quantity * price.getPrice();
    }

    public Orders(Product productId, Product price, int quantity, double orderSum, LocalDate orderDate, Customer customerId) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.orderSum = orderSum;
        this.orderDate = orderDate;
        this.customerId = customerId;
    }
}
