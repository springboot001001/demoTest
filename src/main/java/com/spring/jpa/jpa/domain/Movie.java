package com.spring.jpa.jpa.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name="movie")
public class Movie implements Serializable {

    private static final long serialVersionUID = -6546727230161451721L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;
    @Column
    private Double price;
    @Column(name="action_time")
    private Date actionTime;
}
