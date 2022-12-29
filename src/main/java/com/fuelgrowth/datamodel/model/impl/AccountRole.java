package com.fuelgrowth.datamodel.model.impl;

import com.fuelgrowth.datamodel.model.enums.RoleCode;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class AccountRole {

    @Id
    private Long omniId;

    private String name;

    @Enumerated
    private RoleCode roleCode;

}
