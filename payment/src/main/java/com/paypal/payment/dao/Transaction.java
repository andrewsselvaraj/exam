package com.paypal.payment.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    
    
    private String title;
    private String abbreviation;
    private int modules;
    private double fee;

    @ManyToMany(mappedBy = "transactions", fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();

    public Transaction() {
    }

    public Transaction(String title, String abbreviation, int modules, double fee) {
        this.title = title;
        this.abbreviation = abbreviation;
        this.modules = modules;
        this.fee = fee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getModules() {
        return modules;
    }

    public void setModules(int modules) {
        this.modules = modules;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Set<User> getStudents() {
        return users;
    }

    public void setStudents(Set<User> students) {
        this.users = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction course = (Transaction) o;
        return id.equals(course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", modules=" + modules +
                ", fee=" + fee +
                '}';
    }
}

