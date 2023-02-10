package ua.project.shop.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "Brand")
@Table(name = "brand")
public class Brand {
    @Id
    @SequenceGenerator(name = "sequence_brand_id",
            sequenceName = "sequence_brand_id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_brand_id")
    @Column(name = "brand_id")
    private int brandId;
    @Column(
            name = "brand_name",
            nullable = false,
            columnDefinition = "VARCHAR(80)")
    private String brandName;
    @Column(
            name = "country_brand",
            nullable = false,
            columnDefinition = "VARCHAR(80)")
    private String countryBrand;
}
