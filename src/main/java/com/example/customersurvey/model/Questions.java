package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Inheritance
public abstract class Questions {
    private @Id @GeneratedValue (strategy = GenerationType.AUTO) Long id;
    private String title;

    protected Questions(Long id, String title) {
        this.id = id;
        this.title = title;
    }
    public Questions(){}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }

    public Long getId() {
        return id;
    }

}
