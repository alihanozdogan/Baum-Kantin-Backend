package baum.kantin.kantinmanager.repo;

import baum.kantin.kantinmanager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface productRepo extends JpaRepository<Product,Long> {
    void deleteProductById(Long id);

    Optional<Product> findProductById(Long id);

}
