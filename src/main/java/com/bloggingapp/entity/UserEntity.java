package com.bloggingapp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int id;
    @Column(name = "userName", nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private String password;
    private String about;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.ALL})
    @Column(name = "posts")
    private List<PostEntity> postEntities = new ArrayList();
}
