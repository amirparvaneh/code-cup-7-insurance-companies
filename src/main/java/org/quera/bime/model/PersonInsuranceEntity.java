package org.quera.bime.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persons_insurance")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonInsuranceEntity extends InsuranceEntity {

    private Integer min_age;
}
