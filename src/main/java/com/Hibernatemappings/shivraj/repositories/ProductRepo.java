package com.Hibernatemappings.shivraj.repositories;

import com.Hibernatemappings.shivraj.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
