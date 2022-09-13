package ua.ithillel.hillelwebapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cars")

public class Car {

    @Id
    @Column(name = "id")
    private int id;
    private String manufacturer;
    private String model;
    private int price;
    private int year;
    private boolean available;


    @Override
    public String toString() {
        return "Car { " +
                "id - " + id +
                ", manufacturer - '" + manufacturer + '\'' +
                ", model - '" + model + '\'' +
                ", year - " + year +
                ", price - " + price +
                ", available - " + available +
                '}';
    }
}



