package com.movies.MovieList.model;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Movies {
    @Id
    private Integer id;
    @Column
    private String name;

    public Movies(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Movies() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
