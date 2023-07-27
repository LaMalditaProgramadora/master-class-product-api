package pe.edu.upc.productapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.productapi.model.Product;
import pe.edu.upc.productapi.repository.IProductRepository;
import pe.edu.upc.productapi.service.IProductService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        product = productRepository.save(product);
        return product;
    }

    @Override
    public List<Product> findByNameContains(String name) {
        return productRepository.findByNameContains(name);
    }

    @Override
    public List<Product> findByPriceBetween(double minPrice, double maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }

    @Override
    public List<Product> findByRegisterDateBetween(LocalDate startDate, LocalDate endDate) {
        return productRepository.findByRegisterDateBetween(startDate, endDate);
    }

}
