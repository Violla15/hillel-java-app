package ua.ithillel.hillelwebapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "managers")
public class Manager implements Serializable {

    @Id
    @Column(name = "id")
    private int id;
    private String name;
    private String login;
    private String password;
    private String email;

    @Enumerated(value = EnumType.ORDINAL)
    private Role role;

    @Override
    public String toString() {
        return "Manager{ " +
                "id - " + id +
                ", name - '" + name + '\'' +
                ", login - '" + login + '\'' +
                ", password - '" + password + '\'' +
                ", email - '" + email + '\'' +
                ", role - " + role +
                '}';
    }
}
