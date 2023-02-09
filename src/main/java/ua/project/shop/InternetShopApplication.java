package ua.project.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.project.shop.tables.Customer;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/shop")
public class InternetShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetShopApplication.class, args);
	}

	@GetMapping
	public List<Customer> getCustomers(){
		return List.of(new Customer("John", "Smith","Dnipro", "Nikopol","Sumska str. 12 fl 45", "john-smith@gmail.com", 9999999l));
	}
}
