package br.com.lucas.financial.util;

import br.com.lucas.financial.entity.BankAccountEntity;
import br.com.lucas.financial.entity.OperationEntity;

import java.util.Date;
import java.util.Optional;

public class OperationUtil {
    public static OperationEntity applyTaxFeesForOperation(Optional<BankAccountEntity> originAccount,
                                                           Optional<BankAccountEntity> destinationAccount,
                                                           Date schedulingDate,
                                                           String value) {

        return null;
    }
}
