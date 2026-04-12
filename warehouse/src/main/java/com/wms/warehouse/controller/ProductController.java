package com.wms.warehouse.controller;

import com.wms.warehouse.entity.Product;
import com.wms.warehouse.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    // Add product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repo.save(product);
    }

    // Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return repo.findAll();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Product product = repo.findById(id).orElse(null);

        if (product != null) {
            product.setName(updatedProduct.getName());
            product.setSku(updatedProduct.getSku());
            product.setPrice(updatedProduct.getPrice());
            product.setQuantity(updatedProduct.getQuantity());
            return repo.save(product);
        }

        return null;
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        repo.deleteById(id);
        return "Product deleted";
    }
    
    @GetMapping("/niet")
    public String  getCollegeName() {
    	return "Achal";
    }
}
