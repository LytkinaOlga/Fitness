package by.bntu.fitr.lytkina.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "trainers")
public class Trainer {
    @Id
    @SequenceGenerator(
            name = "trainer_sequence",
            sequenceName = "trainer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "trainer_sequence"
    )
    private int trainerId;
    private String name;
    private int experience;
    private double pricePerHour;
    private String aboutYourself;
}
