package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class VocPosition implements Serializable, Comparable<VocPosition> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPosition;

    @Column
    private String position;


    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public int compareTo(VocPosition that) {
        return Integer.compare(this.idPosition, that.idPosition);
    }

}
