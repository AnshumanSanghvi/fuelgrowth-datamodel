package com.omnirio.datamodel.model.impl;

import com.omnirio.datamodel.model.Account;
import com.omnirio.datamodel.model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "purchase_order")
@SecondaryTable(name="po_sale_info",
    pkJoinColumns=@PrimaryKeyJoinColumn(name="omni_id"))
@SecondaryTable(name = "po_shipping_loc",
    pkJoinColumns=@PrimaryKeyJoinColumn(name="omni_id"))
@SecondaryTable(name = "po_billing_loc",
    pkJoinColumns=@PrimaryKeyJoinColumn(name="omni_id"))
public class PurchaseOrder {

    @Id
    private Long omni_id;

    @Column(name = "order_id")
    private Long globalOrderId;

    @Column(name = "order")
    private Long accountOrderId;

    @Column(name = "date")
    private LocalDateTime purchaseDate;

    @ManyToOne
    private Account account;

    @Embedded
    private POSaleInfo POSaleInfo;

    @Embedded
    private POShippingLoc POShippingLoc;

    @Embedded
    private POBillingLoc POBillingLoc;

    @OneToOne
    private Product product;

    @OneToOne
    private Supplier supplier;


}

