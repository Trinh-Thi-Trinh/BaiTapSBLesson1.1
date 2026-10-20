
package com.Cybersoft.BaiTapSBLesson11.Service;

import com.Cybersoft.BaiTapSBLesson11.Model.Bai4ProductModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Bai4ProductService {

    private final List<Bai4ProductModel> products = new ArrayList<>();
    private int nextId = 1;

    // GET: Lấy danh sách sản phẩm
    public List<Bai4ProductModel> getAllProducts() {
        return products;
    }

    // GET: Tìm sản phẩm theo ID
    public Optional<Bai4ProductModel> getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    // POST: Thêm sản phẩm
    public Bai4ProductModel addProduct(Bai4ProductModel product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    // PUT: Cập nhật sản phẩm
    public Optional<Bai4ProductModel> updateProduct(
            int id, Bai4ProductModel newProduct) {

        Optional<Bai4ProductModel> existingProduct = getProductById(id);

        if (existingProduct.isPresent()) {
            Bai4ProductModel product = existingProduct.get();

            product.setName(newProduct.getName());
            product.setPrice(newProduct.getPrice());

            return Optional.of(product);
        }

        return Optional.empty();
    }

    // DELETE: Xóa sản phẩm
    public boolean deleteProduct(int id) {
        return products.removeIf(product -> product.getId() == id);
    }
}
