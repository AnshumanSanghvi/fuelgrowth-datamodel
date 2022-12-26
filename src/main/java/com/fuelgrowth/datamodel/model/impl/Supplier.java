package com.omnirio.datamodel.model.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Supplier {

    @Id
    private Long omniId;

    private String name;


}
