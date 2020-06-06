package com.assignment.blueoak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateDaysTest {

  @Test
  public void testCalculateNumberOfDaysMethod_1() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(30, classUnderTest.calculateNumberOfDays("05-Feb-2020", "05-Mar-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_2() {
    CalculateDays classUnderTest = new CalculateDays();
    // Expected value should be 120, however it is mentioned 179 in the document.
    assertEquals(120, classUnderTest.calculateNumberOfDays("07-Nov-2019", "05-Mar-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_3() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(366, classUnderTest.calculateNumberOfDays("01-Jul-2019", "30-Jun-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_4() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(-1, classUnderTest.calculateNumberOfDays("05-Mar-2020", "05-Feb-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_5() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(-2, classUnderTest.calculateNumberOfDays("fdfdfdsf", "05-Feb-2020"));
  }

}