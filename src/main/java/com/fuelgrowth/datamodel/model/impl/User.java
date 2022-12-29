package com.fuelgrowth.datamodel.model.impl;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User {

    @Id
    private Long omniId;

    private String name;

    @Email
    private String email;

    @Digits(integer = 12, fraction = 0)
    private String contactNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private AccountRole role;

    private boolean isActive;

}
