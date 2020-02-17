package br.com.lucas.financial.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class DateUtil {

    private static String DATE_PATTERN = "yyyy-MM-dd";

    public static long getDaysOperation(Date schedulingDate) {
        Temporal actualDate = dateToLocalDate(toFormat(new Date()));
        Temporal endDate = dateToLocalDate(toFormat(schedulingDate));
        return ChronoUnit.DAYS.between(actualDate, endDate);
    }

    public static String toFormat(Date date) {
        return new SimpleDateFormat(DATE_PATTERN).format(date);
    }

    public static LocalDate dateToLocalDate(String date) {
        return LocalDate.parse(date);
    }


}
