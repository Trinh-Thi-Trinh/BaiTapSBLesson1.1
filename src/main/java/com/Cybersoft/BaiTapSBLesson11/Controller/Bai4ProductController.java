
package com.Cybersoft.BaiTapSBLesson11.Controller;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai4ProductModel;
import com.Cybersoft.BaiTapSBLesson11.Service.Bai4ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class Bai4ProductController {

    private final Bai4ProductService productService;

    public Bai4ProductController(Bai4ProductService productService) {
        this.productService = productService;
    }

    // GET /products
    @GetMapping
    public List<Bai4ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET /products/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Bai4ProductModel> getProductById(
            @PathVariable int id) {

        return productService.getProductById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST /products
    @PostMapping
    public ResponseEntity<Bai4ProductModel> addProduct(
            @RequestBody Bai4ProductModel product) {

        Bai4ProductModel savedProduct = productService.addProduct(product);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedProduct);
    }

    // PUT /products/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Bai4ProductModel> updateProduct(
            @PathVariable int id,
            @RequestBody Bai4ProductModel product) {

        return productService.updateProduct(id, product)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE /products/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(
            @PathVariable int id) {

        boolean deleted = productService.deleteProduct(id);

        if (deleted) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
