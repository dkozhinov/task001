package ru.kozhinov.webapp.task001.domain;

/**
 *
 * @author Dmitry Kozhinov d.kozhinov@mail.ru
 * Created on 18.06.2019
 */


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class VocName implements Serializable, Comparable<VocName>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idName;

    @Column
    private String name;


    public int getIdName() {
        return idName;
    }

    public void setIdName(int idName) {
        this.idName = idName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(VocName that) {
        return Integer.compare(this.idName, that.idName);
    }

}
