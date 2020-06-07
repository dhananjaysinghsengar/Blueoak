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

  @Test
  public void testCalculateNumberOfDaysMethod_6() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(366, classUnderTest.calculateNumberOfDays("01-Jan-2020", "31-Dec-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_7() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(2, classUnderTest.calculateNumberOfDays("01-Jan-2020", "02-Jan-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_8() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(29, classUnderTest.calculateNumberOfDays("01-Feb-2020", "29-Feb-2020"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_9() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(11323, classUnderTest.calculateNumberOfDays("01-Jan-1980", "31-Dec-2010"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_10() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(-3, classUnderTest.calculateNumberOfDays("01-Jan-1@80", "31-Dec-2010"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_11() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(-3, classUnderTest.calculateNumberOfDays("01-Jan-1980", "31-Dec-2@10"));
  }

  @Test
  public void testCalculateNumberOfDaysMethod_12() {
    CalculateDays classUnderTest = new CalculateDays();
    assertEquals(-2, classUnderTest.calculateNumberOfDays("05-Feb-2020", "fdfdfdsf"));
  }

}