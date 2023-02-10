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
    private int id;
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
    @Column(
            name = "category_id",
            nullable = false)
    private int categoryId;
    @Column(
            name = "bran_id",
            nullable = false)
    private int brandId;

    public Product(String title,
                   String description,
                   Date dateCreated,
                   double price,
                   int categoryId,
                   int brandId) {
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.price = price;
        this.categoryId = categoryId;
        this.brandId = brandId;
    }

    public Product() {}
}
