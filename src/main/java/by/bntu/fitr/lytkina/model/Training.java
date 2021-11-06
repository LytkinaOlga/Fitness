package by.bntu.fitr.lytkina.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity(name = "trainer_user_timetable")
public class Training {
    @Id
    private int recordId;
    @ManyToOne
    private Trainer trainerId;
    private Date date;
    private LocalTime time;
    @ManyToOne
    private User userId;
}
