package baum.kantin.kantinmanager.service;

import baum.kantin.kantinmanager.exceptions.ProductNotFoundException;
import baum.kantin.kantinmanager.model.Product;
import baum.kantin.kantinmanager.repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class productService {
    public final productRepo productRepo;

    @Autowired
    public productService(productRepo productRepo){
        this.productRepo = productRepo;
    }
    public Product addProduct(Product product){
        product.setProductCode(UUID.randomUUID().toString());
        return productRepo.save(product);
    }
    public List<Product> findAllProduct(){
        return productRepo.findAll();
    }
    public Product updateProduct(Product product){
        return productRepo.save(product);
    }
    public void deleteProduct(Long id) {
        productRepo.deleteProductById(id);
    }
    public Product findProductById(Long id) {
        return productRepo.findProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product by id " + id + " was not found"));
    }
//TODO: view model
}
