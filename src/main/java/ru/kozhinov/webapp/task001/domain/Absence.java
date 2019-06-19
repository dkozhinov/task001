package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "absence")
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "cause")
    private String cause;


    @Column(name = "name")
    private String name;

    @Column(name = "position")
    private String position;

    @Column(name = "absencedate")
    private LocalDate absencedate;

    @Column(name = "absencetime")
    private LocalTime absencetime;

    public Absence() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getAbsencedate() {
        return absencedate;
    }

    public void setAbsencedate(LocalDate absencedate) {
        this.absencedate = absencedate;
    }

    public LocalTime getAbsencetime() {
        return absencetime;
    }

    public void setAbsencetime(LocalTime absencetime) {
        this.absencetime = absencetime;
    }
}
