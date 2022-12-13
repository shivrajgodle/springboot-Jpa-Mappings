package com.Hibernatemappings.shivraj;

import com.Hibernatemappings.shivraj.entities.*;
import com.Hibernatemappings.shivraj.repositories.CategoryRepo;
import com.Hibernatemappings.shivraj.repositories.ProductRepo;
import com.Hibernatemappings.shivraj.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShivrajApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

	private Logger logger =  LoggerFactory.getLogger(ShivrajApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ShivrajApplication.class, args);

		System.out.println("hello i am shivraj");
	}

	@Override
	public void run(String... args) throws Exception {

//		one to one mapping

//		Student student = new Student();
//		student.setStudentName("Manisha");
//		student.setStudentId(2);
//		student.setAbout("Electrical Engineer");
//
//		Laptop laptop = new Laptop();
//		laptop.setLaptopId(001);
//		laptop.setBrand("HP");
//		laptop.setModelNumber("NOO3TX");
//
//		//important
//
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//
//		Student stud =studentRepository.save(student);
//
//		logger.info("saved student : {}",stud.getStudentName());
//

//	Student student	= studentRepository.findById(2).get();
//
//	logger.info("Name is {}",student.getStudentName());
//
//	Laptop laptop = student.getLaptop();
//
//	logger.info("Laptop {} , {} ",laptop.getBrand() , laptop.getModelNumber());

		//one to many

//		Student student = new Student();
//		student.setStudentName("Ganesh");
//		student.setStudentId(3);
//		student.setAbout("CEO");
//
//		Address address1 = new Address();
//		address1.setAddressId(1212);
//		address1.setCity("Nanded");
//		address1.setCountry("India");
//		address1.setStreet("Nd 2");
//		address1.setStudent(student);
//
//
//		Address address2 = new Address();
//		address2.setAddressId(1213);
//		address2.setCity("Pune");
//		address2.setCountry("India");
//		address2.setStreet("Kharadi");
//		address2.setStudent(student);
//
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(address1);
//		addressList.add(address2);
//
//
//		student.setAddressList(addressList);
//		Student save = studentRepository.save(student);
//		logger.info("student created : with address");

		//Many to Many
//
//		Product product = new Product();
//		product.setPid(1001);
//		product.setProductName("Ipone pro max");
//
//		Product product1 = new Product();
//		product1.setPid(10022);
//		product1.setProductName("SAMSUNG GALEXY");
//
//		Product product2 = new Product();
//		product2.setPid(1003);
//		product2.setProductName("samsung TV34332");
//
//		Category category = new Category();
//		category.setCid(2001);
//		category.setTitle("Electronics");
//
//		Category category1 = new Category();
//		category1.setCid(2002);
//		category1.setTitle("Mobile phone");
//
//		List<Product> categoryProducts = category.getProducts();
//		categoryProducts.add(product);
//		categoryProducts.add(product1);
//		categoryProducts.add(product2);
//
//		List<Product> category1Products = category1.getProducts();
//		category1Products.add(product);
//		category1Products.add(product1);
//
//		categoryRepo.save(category);
//		categoryRepo.save(category1);

//		Category category = categoryRepo.findById(2002).get();
//		System.out.println(category.getProducts().size());
//
//
//		Category category1 = categoryRepo.findById(2001).get();
//		System.out.println(category1.getProducts().size());


		Product product = productRepo.findById(1001).get();
		System.out.println(product.getCategories().size());
	}
}
