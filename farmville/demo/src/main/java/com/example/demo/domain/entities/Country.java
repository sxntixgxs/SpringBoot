package com.example.demo.domain.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "country") // si no añadimos el (name = ?) se crea la tabla con el mismo nombre de la clase!
public class Country {
    @Id
    @Column(name="code",columnDefinition = "VARCHAR(5)",nullable=false)// se setea el nombre de la columna y la deficnicion del campo
    private String codecountry;
    @Column(columnDefinition = "VARCHAR(50)",nullable = false)//si no se personalizan los String se añade un varchar de 255
    private String name;




    public Country() {
    }

    public String getCodecountry() {
        return codecountry;
    }

    public void setCodecountry(String codecountry) {
        this.codecountry = codecountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
