package com.assignment.blueoak;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

public class UtilityTest {

  @Test
  public void testUtilityMethod_1() throws ParseException {
    Utility classUnderTest = new Utility();
    assertEquals(1580821200000L, classUnderTest.convertStringDateToEpoch("05-Feb-2020"));

  }

  @Test(expected = ParseException.class)
  public void testUtilityMethod_2() throws ParseException {
    Utility classUnderTest = new Utility();
    classUnderTest.convertStringDateToEpoch("fdfdfd");

  }

  @Test
  public void testUtilityMethod_3() throws ParseException {
    Utility classUnderTest = new Utility();
    assertEquals(-62101245600000L, classUnderTest.convertStringDateToEpoch("05-Feb-2@20"));
  }

}