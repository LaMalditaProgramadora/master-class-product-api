package pe.edu.upc.productapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.productapi.model.Product;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContains(String name);
    List<Product> findByPriceBetween(double minPrice, double maxPrice);
    List<Product> findByRegisterDateBetween(LocalDate startDate, LocalDate endDate);
}

