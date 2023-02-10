package ua.project.shop.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity(name = "Product")
@Table(name = "product")
public class Product {
    @Id
    @SequenceGenerator(name = "sequence_product_id",
            sequenceName = "sequence_product_id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_product_id")
    @Column(name = "id")
    private int productId;
    @Column(
            name = "title",
            nullable = false,
            columnDefinition = "VARCHAR(80)")
    private String title;
    @Column(
            name = "description",
            nullable = false,
            columnDefinition = "TEXT")
    private String description;
    @Column(
            name = "date_created",
            nullable = false)
    private Date dateCreated;
    @Column(
            name = "price",
            nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "category_id")
    private Category categoryId;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "brand_id")
    private Brand brandId;

    public Product(String title,
                   String description,
                   Date dateCreated,
                   double price) {
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.price = price;
    }

    public Product() {}
}
