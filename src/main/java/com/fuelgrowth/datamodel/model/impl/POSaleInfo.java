package com.fuelgrowth.datamodel.model.impl;

import com.fuelgrowth.datamodel.model.enums.SaleChannel;
import com.fuelgrowth.datamodel.model.enums.SaleType;
import javax.persistence.Embeddable;
import javax.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
public class POSaleInfo {

    private Long saleId;

    @Enumerated
    private SaleType saleType;

    @Enumerated
    private SaleChannel saleChannel;


}
