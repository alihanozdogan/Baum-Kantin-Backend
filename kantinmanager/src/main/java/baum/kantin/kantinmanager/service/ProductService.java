package baum.kantin.kantinmanager.service;

import baum.kantin.kantinmanager.exception.ProductNotFoundException;
import baum.kantin.kantinmanager.model.Product;
import baum.kantin.kantinmanager.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo){
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
    public void deleteProduct(Long id){
        productRepo.deleteProductbyId(id);
    }
    public Product findProductbyId(Long id){
       return productRepo.findProductbyId(id).orElseThrow(() -> new ProductNotFoundException("Product by id "+ id + "not found"));
    }

}
