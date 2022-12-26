package com.omnirio.datamodel.model.impl;

import com.omnirio.datamodel.model.Location;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class POBillingLoc implements Location {

    private String country;

    private String region;

    private String state;

    private String city;
}
