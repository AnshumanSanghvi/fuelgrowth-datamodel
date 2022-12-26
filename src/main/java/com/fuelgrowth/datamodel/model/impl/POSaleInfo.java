package com.omnirio.datamodel.model.impl;

import com.omnirio.datamodel.model.enums.SaleChannel;
import com.omnirio.datamodel.model.enums.SaleType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;

@Embeddable
public class POSaleInfo {

    private Long saleId;

    @Enumerated
    private SaleType saleType;

    @Enumerated
    private SaleChannel saleChannel;



}
