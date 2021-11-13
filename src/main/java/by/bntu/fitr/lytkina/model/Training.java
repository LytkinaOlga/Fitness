package by.bntu.fitr.lytkina.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity(name = "trainer_user_timetable")
public class Training {
    @Id
    @SequenceGenerator(
            name = "training_sequence",
            sequenceName = "training_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "training_sequence"
    )
    private int recordId;
    @ManyToOne
    private Trainer trainerId;
    private Date date;
    private LocalTime time;
    @ManyToOne
    private User userId;
}
