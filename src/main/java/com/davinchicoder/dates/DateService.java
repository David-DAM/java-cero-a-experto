package com.davinchicoder.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateService {

    public Date getCurrentDate() {
        return new Date();
    }

    public void getSpecificDate(String date) {
        Date date1 = new Date(date);
        System.out.println(date1);
    }

    public LocalDate getDateParsed(String date, String format) {

        return LocalDate.parse(date, DateTimeFormatter.ofPattern(format));

    }

}
