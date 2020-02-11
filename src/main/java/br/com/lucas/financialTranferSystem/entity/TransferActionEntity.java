package br.com.lucas.financialTranferSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "transfer_action_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferActionEntity implements Serializable {

    private static final long serialVersionUID = -6114821393745011938L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_db_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "origin_account_db_id", nullable = false)
    private BankAccountEntity originAccount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "dest_account_db_id", nullable = false)
    private BankAccountEntity destinationAccount;

    @Digits(integer = 9, fraction = 2)
    private BigDecimal transferValue;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date transferDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date schedulingDate;


}
