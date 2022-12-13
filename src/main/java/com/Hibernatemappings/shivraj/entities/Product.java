package com.Hibernatemappings.shivraj.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_product")
public class Product {

    @Id
    private int pid;
    private String productName;

    @ManyToMany(mappedBy = "products" , cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Category> categories = new ArrayList<>();


    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Product() {
    }

    public Product(int pid, String productName) {
        this.pid = pid;
        this.productName = productName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
