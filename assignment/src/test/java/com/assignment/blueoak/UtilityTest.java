package com.assignment.blueoak;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

public class UtilityTest {

  @Test
  public void testCalculateNumberOfDaysMethod_1() throws ParseException {
    Utility classUnderTest = new Utility();
    assertEquals(1580821200000L, classUnderTest.convertStringDateToEpoch("05-Feb-2020"));

  }

  @Test(expected = ParseException.class)
  public void testCalculateNumberOfDaysMethod_2() throws ParseException {
    Utility classUnderTest = new Utility();
    // assertEquals(1580821200000L,
    // classUnderTest.convertStringDateToEpoch("fdfdfd"));
    classUnderTest.convertStringDateToEpoch("fdfdfd");

  }

}