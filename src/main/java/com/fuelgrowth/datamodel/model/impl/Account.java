package com.fuelgrowth.datamodel.model.impl;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Account {
    @Id
    private Long omniId;

    @Email
    private String primaryEmail;

    @Email
    private String secondaryEmail;

    private String businessName;

    private String name;

    @Digits(integer = 12, fraction = 0)
    private String contactNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        Account account = (Account) o;
        return omniId != null && Objects.equals(omniId, account.omniId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
