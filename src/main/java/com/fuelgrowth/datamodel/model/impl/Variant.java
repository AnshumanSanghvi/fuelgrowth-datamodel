package com.omnirio.datamodel.model.impl;

import jakarta.persistence.Embeddable;

@Embeddable
public class Variant {

    //maps to Product.omniId
    private Long productId;

    private String name;

    private String sku;

}
