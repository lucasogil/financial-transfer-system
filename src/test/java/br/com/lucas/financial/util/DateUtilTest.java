package br.com.lucas.financial.util;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {

    @Test
    void getDaysOperation() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 18);
        final Date schedulingDate = calendar.getTime();
        System.out.println("Scheduling Date: " + schedulingDate);
        System.out.println("Days Operation: " + DateUtil.getDaysOperation(schedulingDate));
    }

    @Test
    void toFormat() {
        Date actualDate = new Date();
        System.out.println("Old Format: " + actualDate.toString());
        System.out.println("New Format: " + DateUtil.toFormat(actualDate));
    }

    @Test
    void dateToLocalDate() {
        String dateString = "2017-05-20";
        boolean isLocalDate = DateUtil.dateToLocalDate(dateString) instanceof LocalDate;
        System.out.println("isLocalDate: " + isLocalDate);
    }

}