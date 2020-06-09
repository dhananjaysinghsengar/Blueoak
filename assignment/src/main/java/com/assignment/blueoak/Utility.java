package com.assignment.blueoak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

  /**
   * @param inputDate
   * @return long
   * @throws ParseException
   */
  public long convertStringDateToEpoch(String inputDate) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    Date dt = sdf.parse(inputDate);
    long epoch = dt.getTime();
    return epoch;
  }

}