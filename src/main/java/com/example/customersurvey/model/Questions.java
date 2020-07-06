package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Inheritance
@Table(name="questions")
public abstract class Questions {
    private @Id @GeneratedValue (strategy = GenerationType.AUTO) Long id;
    @Column(name="title")
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
