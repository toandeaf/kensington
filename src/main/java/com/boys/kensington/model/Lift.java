package com.boys.kensington.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "lift", schema = "dads")
public class Lift {
    @Id
    @GeneratedValue
    private UUID id;
    private Integer max;
    private String type;
    @ManyToOne
    @JsonIgnore
    private Boy boy;

}
