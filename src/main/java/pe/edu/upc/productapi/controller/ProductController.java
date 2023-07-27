package pe.edu.upc.productapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.productapi.model.Product;
import pe.edu.upc.productapi.service.IProductService;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

}
