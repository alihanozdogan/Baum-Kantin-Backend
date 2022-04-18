package baum.kantin.kantinmanager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private Double price;
    private Integer Stock;
    private String imageUrl;
    private Long categoryId;
    @Column(nullable = false, updatable = false)
    private String productCode;

    public Product(String name, Double price, Integer stock, String imageUrl, String productCode) {
        this.name = name;
        this.price = price;
        this.Stock = stock;
        this.imageUrl = imageUrl;
        this.productCode = productCode;
    }



    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Stock=" + Stock +
                ", imageUrl='" + imageUrl + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }}
