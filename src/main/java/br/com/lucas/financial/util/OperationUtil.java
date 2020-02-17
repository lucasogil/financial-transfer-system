package br.com.lucas.financial.util;

import br.com.lucas.financial.entity.BankAccountEntity;
import br.com.lucas.financial.entity.OperationEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;

public class OperationUtil {



    public static OperationEntity applyTaxFeesForOperation(Optional<BankAccountEntity> originAccount,
                                                           Optional<BankAccountEntity> destinationAccount,
                                                           Date schedulingDate,
                                                           String value) throws ParseException {

//        long daysOperation = DateUtil.getDaysOperation(schedulingDate);

        return null;
    }



}
