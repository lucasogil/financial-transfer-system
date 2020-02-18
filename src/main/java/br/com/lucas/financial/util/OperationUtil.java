package br.com.lucas.financial.util;

import br.com.lucas.financial.entity.OperationTaxRulesEntity;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

public class OperationUtil {

    public static OperationTaxRulesEntity selectRule(Long daysBetweenInterval, List<OperationTaxRulesEntity> allRules) {
//        OperationTaxRulesEntity operationTaxRulesEntity = allRules.stream().
//                filter(rule -> rule.getInterval().split(";")[0])
        return null;
    }

    public static boolean matchInterval(Long days, String interval) {
        String[] intervalArray = interval.split(";");
        Long begin = Long.parseLong(intervalArray[0]);
        Long end = Long.parseLong(intervalArray[1]);
        if(Enumeration)
    }

}
