package ua.project.shop.controllers;

import org.springframework.web.bind.annotation.*;
import ua.project.shop.tables.Customer;
import ua.project.shop.tables.Product;

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
    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
    allServices.addProduct(product);
    }
    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer){
    allServices.addCustomer(customer);
    }
}
