package com.fuelgrowth.datamodel.model.impl;

import com.fuelgrowth.datamodel.model.Location;
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
public class POShippingLoc implements Location {

    private String country;

    private String region;

    private String state;

    private String city;

}
