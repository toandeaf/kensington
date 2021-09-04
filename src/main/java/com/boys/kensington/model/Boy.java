package com.boys.kensington.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "boy", schema = "dads")
public class Boy {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private Integer age;
    private String job;
}
