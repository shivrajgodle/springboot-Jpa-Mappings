package com.Hibernatemappings.shivraj.repositories;

import com.Hibernatemappings.shivraj.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {
}
