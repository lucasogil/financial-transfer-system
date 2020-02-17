package br.com.lucas.financial.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity(name = "operation_rules_db")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperationTaxRulesEntity implements Serializable {

    private static final long serialVersionUID = 3205849446510751071L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 25)
    private String interval;

    @NotNull
    private Long limitOperationValue;

    @NotNull
    private Long fixedTax;

    @NotNull
    private Long percentageTax;

    @NotNull
    private boolean applyDays;

    @NotNull
    @Size(max = 200)
    private String description;

}
