package ua.project.shop.controllers;

import org.springframework.stereotype.Service;
import ua.project.shop.repositories.*;
import ua.project.shop.tables.*;

import java.util.List;

@Service
public class AllServices {
    private final BrandRepository brandRepository;
    private final OrdersRepository ordersRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;
    private final CategoryRepository categoryRepository;

    public AllServices(BrandRepository brandRepository,
                       OrdersRepository ordersRepository,
                       ProductRepository productRepository,
                       CustomerRepository customerRepository,
                       CategoryRepository categoryRepository) {
        this.brandRepository = brandRepository;
        this.ordersRepository = ordersRepository;
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
        this.categoryRepository = categoryRepository;
    }
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }
    public List<Brand> getBrand(){
        return brandRepository.findAll();
    }
    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }
    public void addBrand(Brand brand) {
        brandRepository.save(brand);
    }
    public void addOrders(Orders orders) {
        ordersRepository.save(orders);
    }
}
