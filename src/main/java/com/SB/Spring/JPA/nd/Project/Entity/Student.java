package com.SB.Spring.JPA.nd.Project.Entity;

import javax.persistence.*;

@Entity
@Table(name ="School")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    int id;
    @Column(name="Sname")
    String name;
    @Column(name="standard")
    String standard;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
