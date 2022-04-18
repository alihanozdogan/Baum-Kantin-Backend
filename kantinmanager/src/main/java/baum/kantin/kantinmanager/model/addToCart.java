package baum.kantin.kantinmanager.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class addToCart implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long productId;
    private Long quantity;
    private Double price;
    private Date addedDate;
    public addToCart(){}

    public addToCart(Long id, Long productId, Long quantity, Double price, Date addedDate) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.addedDate = addedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "addToCart{" +
                "id=" + id +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", addedDate=" + addedDate +
                '}';
    }
}
