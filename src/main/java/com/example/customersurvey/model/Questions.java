package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author ozgeonec
 */
@Data
@Entity
public abstract class Questions {
    private @Id @GeneratedValue Long id;
    private String title;

    protected Questions(Long id, String title) {
        this.id = id;
        this.title = title;
    }

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
