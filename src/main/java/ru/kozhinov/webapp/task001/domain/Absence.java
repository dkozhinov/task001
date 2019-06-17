package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vAbsence")
public class Absence implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "IDNAME", nullable = true)
    private int idName;

    @Column(name = "IDPOSITION", nullable = true)
    private int idPosition;

    @Column(name = "CAUSE", nullable = true)
    private String cause;

    @Column(name = "NAME", nullable = true)
    private String name;

    @Column(name = "POSITION", nullable = true)
    private String position;



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
