package org.quera.bime.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "insurances")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Type type;
    private String name;
    private Double price;
    private LocalDateTime created_at;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private CompanyEntity company;
}
