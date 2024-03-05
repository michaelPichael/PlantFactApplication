package org.trueplant.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plants")
@Getter
@Setter
public class Plant {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String origin;
    private String soilType;
    private String hardinessZone;
}
