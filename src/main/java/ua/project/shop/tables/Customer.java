package ua.project.shop.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity (name = "Customer")
@Table (name = "customer",
        uniqueConstraints = {@UniqueConstraint(name = "customer_email_unique", columnNames = "email")})
@NoArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(name = "sequence_customer_id",
            sequenceName = "sequence_customer_id",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "sequence_customer_id")
    @Column(name = "customer_id")
    private int customerId;
    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "VARCHAR(50)")
    private String firstName;
    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "VARCHAR(50)")
    private String lastName;
    @Column(
            name = "state",
            nullable = false,
            columnDefinition = "VARCHAR(50)")
    private String state;
    @Column(
            name = "city",
            nullable = false,
            columnDefinition = "VARCHAR(50)")
    private String city;
    @Column(
            name = "address",
            nullable = false,
            columnDefinition = "VARCHAR(80)")
    private String address;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "VARCHAR(50)")
    private String email;
    @Column(
            name = "telephone",
            nullable = false)
    private Long telephone;

    public Customer(String firstName,
                    String lastName,
                    String state,
                    String city,
                    String address,
                    String email,
                    Long telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
    }
}
