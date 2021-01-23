package com.aman.proinhack.lld.recruitment_app.main.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

  public static Date convertDate(String dateStr) throws ParseException {
    return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
  }
}
