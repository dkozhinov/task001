package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

import javax.persistence.*;

@Entity
@Table(name = "Absence", schema = "dbo")
public class Absence {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "ID_NAME")
    private int idName;

    @Column(name = "ID_POSITION")
    private int idPosition;

    @Column(name = "CAUSE")
    private String cause;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POSITION")
    private String position;


    public Absence() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getIdName() {
        return idName;
    }

    public void setIdName(int idName) {
        this.idName = idName;
    }


    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
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

}
