package com.assignment.blueoak;

public class CalculateDays {

  public long calculateNumberOfDays(String startDate, String endDate) {
    long startDateInEpoch, endDateInEpoch;
    double numberOfDays = 0.0f;
    Utility utilityObject = new Utility();
    try {

      startDateInEpoch = utilityObject.convertStringDateToEpoch(startDate);

      endDateInEpoch = utilityObject.convertStringDateToEpoch(endDate);

      if (startDateInEpoch < 0 || endDateInEpoch < 0) {
        // Special character should be rejected
        return -3;

      } else if (startDateInEpoch >= endDateInEpoch)
        // Start date should be earlier than end date

        return -1;
      else {

        numberOfDays = (double) ((endDateInEpoch - startDateInEpoch) / (1000 * 60 * 60 * 24));
        return (long) numberOfDays + 1;

      }

    } catch (Exception e) {
      e.printStackTrace();
    }
    return -2;

  }

}