package com.fuelgrowth.datamodel.model.impl;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@SecondaryTable(name = "product_variant")
@Getter
@Setter
@ToString
@NoArgsConstructor
public abstract class Product {

    @Id
    private Long omniId;


    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_category_map", joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id"))
    @ToString.Exclude
    private List<Category> categories;

    private String description;

    private String sku;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "var_name", table = "product_variant")),
        @AttributeOverride(name = "sku", column = @Column(name = "var_sku", table = "product_variant")),
    })
    private Variant variant;

    @Digits(integer = 12, fraction = 2)
    private Double mrp;

    private LocalDateTime manufacturingTime;



}
