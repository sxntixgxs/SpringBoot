package com.example.demo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    public Region getRegion() {
        return region;
    }
    public void setRegion(Region region) {
        this.region = region;
    }
    @Id
    @Column(columnDefinition = "VARCHAR(5)",nullable=false)
    private String code;
    @Column(columnDefinition = "VARCHAR(5)",nullable=false)
    private String name;

    @ManyToOne
    private Region region;

    public City() {
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
