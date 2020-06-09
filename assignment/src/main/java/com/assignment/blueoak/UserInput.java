package com.assignment.blueoak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

  /**
   * @return List<String>
   */
  public List<String> userInput() {
    List<String> inputDate = new ArrayList<>();
    String startDate, endDate;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter start date in dd-Mmm-yyyy format e.g. 05-Feb-2020");
    startDate = scanner.nextLine();
    System.out.println("Start date is: " + startDate);

    System.out.println("Enter end date in dd-Mmm-yyyy format e.g. 05-Mar-2020");
    endDate = scanner.nextLine();
    System.out.println("End date is: " + endDate);

    inputDate.add(startDate);
    inputDate.add(endDate);
    scanner.close();
    return inputDate;

  }

}