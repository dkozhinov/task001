package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 17.06.2019
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Absence implements Serializable, Comparable<Absence> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int idName;

    @Column
    private int idPosition;

    @Column
    private String cause;

    @Column
    private String name;

    @Column
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


    @Override
    public int compareTo(Absence that) {
        return Integer.compare(this.id, that.id);
    }


}
