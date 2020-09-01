package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
public class User {
    private Long id;
    private String name;
    private Integer age;

    public User(Long id,String name, Integer age) {
        this.id=id;
        this.name = name;
        this.age = age;

    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}