package ru.pgeenergo.useralert.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @NotNull
    @NotBlank
    @Column(name = "first_name")
    private String firstname;

    @NotNull
    @NotBlank
    @Column(name = "last_name")
    private String lastname;

    @Column(name = "surname")
    private String surname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "start_day")
    private Calendar startDay;

    @Column(name = "end_day")
    private Calendar endDay;

    @Size(max = 250)
    @Column(name = "message")
    private String message;
}
