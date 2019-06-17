package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "vocPosition")
public class VocPosition implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "POSITION", nullable = true)
    private String position;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
