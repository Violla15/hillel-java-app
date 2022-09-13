package ua.ithillel.hillelwebapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name = "id")
    private int id;
    private String name;
    private String surname;
    private String phone;

    @Override
    public String toString() {
        return "Client {" +
                "id - " + id + ", name - '" + name + '\'' +
                ", surname - '" + surname + '\'' +
                ", phone : '" + phone + '\'' + '}';
    }
}
