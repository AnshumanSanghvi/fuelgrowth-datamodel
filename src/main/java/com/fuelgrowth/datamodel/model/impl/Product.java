package com.fuelgrowth.datamodel.model;

import com.fuelgrowth.datamodel.model.impl.Category;
import com.fuelgrowth.datamodel.model.impl.Variant;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "product")
@SecondaryTable(name = "product_variant",
    pkJoinColumns = @PrimaryKeyJoinColumn(name = "omni_id"))
public abstract class Product {

    @Id
    private Long omniId;

    private String name;

    @ManyToMany
    private List<Category> categories;

    private String description;

    private String sku;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "var_name", table = "product_variant")),
        @AttributeOverride(name = "sku", column = @Column(name = "var_sku", table = "product_variant")),
    })
    private Variant variant;

    private Double mrp;

    private LocalDateTime manufacturingTime;



}
