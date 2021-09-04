package com.boys.kensington.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "boy", schema = "dads")
public class Boy {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Integer age;
    private String job;
    @OneToMany
    private List<Lift> lifts;
}
