package ua.project.shop.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity (name = "Category")
@Table(name = "category")
public class Category {
    @Id
    @SequenceGenerator(name = "sequence_category_id",
            sequenceName = "sequence_category_id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_category_id")
    @Column(name = "category_id")
    private int categoryId;
    @Column(
            name = "category_name",
            nullable = false,
            columnDefinition = "VARCHAR(80)")
    private String categoryName;
}
