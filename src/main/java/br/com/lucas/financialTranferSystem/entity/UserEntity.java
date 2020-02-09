package br.com.lucas.financialTranferSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "user_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -7201824499103946282L;

    @Id
    private Integer id;
    private String name;
    private BigDecimal balance;

}
