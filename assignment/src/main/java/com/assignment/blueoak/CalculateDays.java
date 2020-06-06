package com.assignment.blueoak;

public class CalculateDays {

  public long calculateNumberOfDays(String startDate, String endDate) {
    long startDateInEpoch, endDateInEpoch;
    double numberOfDays = 0.0f;
    Utility utilityObject = new Utility();
    try {

      startDateInEpoch = utilityObject.convertStringDateToEpoch(startDate);
      System.out.println("start date: " + startDateInEpoch);

      endDateInEpoch = utilityObject.convertStringDateToEpoch(endDate);
      System.out.println("end date: " + endDateInEpoch);

      if (startDateInEpoch <= endDateInEpoch) {
        numberOfDays = (double) ((endDateInEpoch - startDateInEpoch) / (1000 * 60 * 60 * 24));
        System.out.println("Diff:" + numberOfDays);
        return (long) numberOfDays + 1;

      } else {
        return -1;

      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return -2;

  }

}