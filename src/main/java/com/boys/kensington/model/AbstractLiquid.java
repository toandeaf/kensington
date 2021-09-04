package com.boys.kensington.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "liquid", schema = "dads")
public class AbstractLiquid implements Liquid {
    @Id
    @GeneratedValue
    private UUID id;
    private double volume;
    private String colour;
    private String aroma;
    private BubbleType weeBubbles;
    private Type type;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private AbstractContainer container;
}
