package by.bntu.fitr.lytkina.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "trainers")
public class Trainer {
    @Id
    private int traineriD;
    private String name;
    private int experience;
    private double pricePerHour;
    private String aboutYourself;
}
