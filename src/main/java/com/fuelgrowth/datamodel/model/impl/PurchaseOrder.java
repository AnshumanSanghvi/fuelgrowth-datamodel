package com.fuelgrowth.datamodel.model.impl;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "purchase_order")
@SecondaryTable(name = "po_sale_info")
@SecondaryTable(name = "po_shipping_loc")
@SecondaryTable(name = "po_billing_loc")
public class PurchaseOrder {

    @Id
    private Long omniId;

    @Column(name = "global_order_id")
    private Long globalOrderId;

    @Column(name = "account_order_id")
    private Long accountOrderId;

    @Column(name = "date")
    private LocalDateTime purchaseDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    @ToString.Exclude
    private Account account;

    @Embedded
    private POSaleInfo POSaleInfo;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "country", column = @Column(name = " country", table = "po_shipping_loc")),
        @AttributeOverride(name = "region", column = @Column(name = "region", table = "po_shipping_loc")),
        @AttributeOverride(name = "state", column = @Column(name = "state", table = "po_shipping_loc")),
        @AttributeOverride(name = "city", column = @Column(name = "city", table = "po_shipping_loc"))
    })
    private POShippingLoc POShippingLoc;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "country", column = @Column(name = " country", table = "po_billing_loc")),
        @AttributeOverride(name = "region", column = @Column(name = "region", table = "po_billing_loc")),
        @AttributeOverride(name = "state", column = @Column(name = "state", table = "po_billing_loc")),
        @AttributeOverride(name = "city", column = @Column(name = "city", table = "po_billing_loc"))
    })
    private POBillingLoc POBillingLoc;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    @ToString.Exclude
    private Product product;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    @ToString.Exclude
    private Supplier supplier;


}

