package baum.kantin.kantinmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Category implements Serializable {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(nullable = false,updatable = false)
     private Long id;
     private String name;

     public Category(){}

    public Category(Long id, String name) {
        this.id = id;
        this.name =name;
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

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
