package ua.project.shop.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.project.shop.repositories.CustomerRepository;
import ua.project.shop.repositories.ProductRepository;
import ua.project.shop.tables.Customer;
import ua.project.shop.tables.Product;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ConfigurationClass {

    @Bean
    CommandLineRunner commandLineRunner (CustomerRepository customerRepository) {
        return args -> {
            Customer smith = new Customer("John",
                    "Smith",
                    "Dnipro",
                    "Nikopol",
                    "Sumska str. 12 fl 45",
                    "john-smith@gmail.com",
                    9999999l);
            Customer spenser = new Customer("Alex",
                    "Spenser",
                    "Kyiv",
                    "Bucha",
                    "Nezalegnosti str 345 fl 11",
                    "alex_sp@gmail.com",
                    8920012l);
            Customer alex = new Customer("Alex",
                    "Brody",
                    "Kharkiv",
                    "Kharkiv",
                    "Flamenki str 10 fl 10",
                    "alex-bro@gmail.com",
                    3443212l);
            customerRepository.saveAll(List.of(smith, spenser, alex));
                    };
    }
    @Bean
    CommandLineRunner commandLineRunner1 (ProductRepository productRepository) {
        return args -> {
            Product p = new Product("Notebook",
                    "some description of the product",
                    LocalDate.of(2012, Month.APRIL, 23),
                    724.29);
            Product d = new Product("AnotherNotebook",
                    "some another description of the product",
                    LocalDate.of(2020, Month.DECEMBER, 12),
                    1452.99);
            Product g = new Product("Notebook1",
                    "some description of the product1",
                    LocalDate.of(2018, Month.FEBRUARY, 28),
                    28000.99);
            productRepository.saveAll(List.of(p, d, g));
        };

    }
}
