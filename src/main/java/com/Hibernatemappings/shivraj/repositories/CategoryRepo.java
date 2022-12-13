package com.Hibernatemappings.shivraj.repositories;

import com.Hibernatemappings.shivraj.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
