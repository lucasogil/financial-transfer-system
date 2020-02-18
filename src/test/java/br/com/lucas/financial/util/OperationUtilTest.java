package br.com.lucas.financial.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationUtilTest {

    @Test
    void selectRule() {
    }

    @Test
    void matchInterval() {
        Long days = 10L;
        String interval = "0;10";
        System.out.println("Valid Interval: "+OperationUtil.matchInterval(days, interval));
    }
}