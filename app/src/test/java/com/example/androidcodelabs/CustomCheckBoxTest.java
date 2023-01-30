package com.example.androidcodelabs;

import com.example.androidcodelabs.customcheckbox.CustomCheckBox;

import junit.framework.TestCase;

import org.junit.Assert;

public class CustomCheckBoxTest extends TestCase {

    public void testCreateOrderDetails() {
        String expectedOutput = "Selected items\nPizza : Rs.100\nZomato : Rs.120\nTotal :Rs.220";
        String actualOutput = new CustomCheckBox().createOrderDetails(true, true);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}