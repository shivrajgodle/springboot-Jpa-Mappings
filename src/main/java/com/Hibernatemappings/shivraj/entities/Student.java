package com.Hibernatemappings.shivraj.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_student")
public class Student {
    @Id
    private int studentId;
    private String StudentName;
    private String about;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

    //Many Address
    @OneToMany(mappedBy = "student" , cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();


    public Student() {
    }


    public Student(int studentId, String studentName, String about, Laptop laptop) {
        this.studentId = studentId;
        StudentName = studentName;
        this.about = about;
        this.laptop = laptop;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
