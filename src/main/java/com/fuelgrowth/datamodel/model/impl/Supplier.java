package com.fuelgrowth.datamodel.model.impl;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    private Long omniId;

    private String name;


}
