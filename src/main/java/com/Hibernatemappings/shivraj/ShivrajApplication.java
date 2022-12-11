package com.Hibernatemappings.shivraj;

import com.Hibernatemappings.shivraj.entities.Address;
import com.Hibernatemappings.shivraj.entities.Laptop;
import com.Hibernatemappings.shivraj.entities.Student;
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

		Student student = new Student();
		student.setStudentName("Ganesh");
		student.setStudentId(3);
		student.setAbout("CEO");

		Address address1 = new Address();
		address1.setAddressId(1212);
		address1.setCity("Nanded");
		address1.setCountry("India");
		address1.setStreet("Nd 2");
		address1.setStudent(student);


		Address address2 = new Address();
		address2.setAddressId(1213);
		address2.setCity("Pune");
		address2.setCountry("India");
		address2.setStreet("Kharadi");
		address2.setStudent(student);

		List<Address> addressList = new ArrayList<>();
		addressList.add(address1);
		addressList.add(address2);


		student.setAddressList(addressList);
		Student save = studentRepository.save(student);
		logger.info("student created : with address");
	}
}
