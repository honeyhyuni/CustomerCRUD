package com.honeyhyuni.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private int birthday;
    private LocalDateTime createdAt;

    public User(int id, String name, String phone, int birthday, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.birthday = birthday;
        this.createdAt = createdAt;
    }

    protected User() {

    }
}
