package com.findajob.backend.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String fullname;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false, unique = true)
    private String email;

    @Getter(value = AccessLevel.NONE)
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean status;

    @ManyToMany(fetch = FetchType.LAZY) //Llave foranea(?) Id de tabla Role
    @JoinColumn(nullable = false)
    private List<Role> roles;

    @Column(nullable = false)
    private Date registration;

    public boolean checkPassword(String password){ //Método para verificar un password
        return this.password.equals(password);
    }
}
