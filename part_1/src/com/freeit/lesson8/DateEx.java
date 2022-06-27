package com.freeit.lesson8;


import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DateEx {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);
        // milliseconds from 1 January 1970
        System.out.println(d.getTime());

        Random rand = new Random();

        Date d2 = new Date(rand.nextInt(22) + 100, 5, 27);
        Date d3 = new Date(rand.nextInt(22) + 100, 5, 27);
        System.out.println("d2 > d3: " + (d2.after(d3)));
        System.out.println("d2 < d3: " + (d2.before(d3)));

        //***********************************************
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(d2));

        GregorianCalendar gc = new GregorianCalendar(2022, 5, 27);
        gc.set(Calendar.YEAR, 2022);

        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.GERMAN));

        gc.get(Calendar.MONTH);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate ld2 = ld.plus(5, ChronoUnit.DAYS);
        System.out.println(ld2);

    }
}
