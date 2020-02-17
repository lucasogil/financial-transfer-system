package br.com.lucas.financial.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "operation_rules_db")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperationRulesEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String interval;

    private Long limitOperationValue;

    private Long fixedTax;

    private Long percentageTax;

    private String description;

}
