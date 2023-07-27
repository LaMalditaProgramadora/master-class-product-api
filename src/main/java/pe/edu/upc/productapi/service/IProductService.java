package pe.edu.upc.productapi.service;

import pe.edu.upc.productapi.model.Product;

import java.time.LocalDate;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product save(Product product);
    List<Product> findByNameContains(String name);
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
    List<Product> findByRegisterDateBetween(LocalDate startDate, LocalDate endDate);
}
