package com.fuelgrowth.datamodel.model.impl;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Variant {

    @Column(name = "var_name")
    private String name;

    @Column(name = "var_sku")
    private String sku;

}
