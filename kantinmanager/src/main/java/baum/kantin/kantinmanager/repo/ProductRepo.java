package baum.kantin.kantinmanager.repo;

import baum.kantin.kantinmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProductRepo extends JpaRepository<Product,Long> {


    void deleteProductbyId(Long id);

    Optional<Product> findProductbyId(Long id);
}
