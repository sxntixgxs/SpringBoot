package com.example.demo.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @Column(columnDefinition = "VARCHAR(5)",nullable=false)
    private String code;
    @Column(columnDefinition="VARCHAR(50)",nullable=false)
    private String name;

    @ManyToOne //estoy estableciendo la relacion con la tabla/entidad country
    // @JoinColumn(name = "code_country")
    private Country country;

    public Region() {
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
