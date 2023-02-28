package ua.project.shop.controllers;

import org.springframework.web.bind.annotation.*;
import ua.project.shop.tables.*;

import java.util.List;

@RestController
@RequestMapping ("/")
public class Controller {
    private AllServices allServices;

    public Controller(AllServices allServices) {
        this.allServices = allServices;
    }
    @GetMapping("/product")
    public List<Product> getProductList() {
        return allServices.getProducts();
    }
    @GetMapping("/customer")
    public List<Customer> getCustomers(){
    return allServices.getCustomers();
    }
    @GetMapping("/orders")
    public List<Orders> getOrders() {
        return allServices.getOrders();
    }
    @GetMapping("/category")
    public List<Category> getCategories(){
        return allServices.getCategories();
    }
    @GetMapping("/brand")
    public List<Brand> getBrands(){
        return allServices.getBrand();
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
    allServices.addProduct(product);
    }
    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
    allServices.addCustomer(customer);
    }
    @PostMapping("/orders")
    public void addOrders(@RequestBody Orders orders){
        allServices.addOrders(orders);
    }
    @PostMapping("/category")
    public void addCategory(@RequestBody Category category){
        allServices.addCategory(category);
    }
    @PostMapping("/brand")
    public void addBrand(@RequestBody Brand brand){
        allServices.addBrand(brand);
    }
}
