package com.boys.kensington.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "container", schema = "dads")
public class AbstractContainer implements Container {
    @Id
    @GeneratedValue
    UUID id;
    double capacity;
    @OneToMany(fetch = FetchType.EAGER)
    List<AbstractLiquid> liquids;
}
