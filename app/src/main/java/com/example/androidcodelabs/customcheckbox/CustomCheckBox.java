package com.example.androidcodelabs.customcheckbox;

public class CustomCheckBox implements CustomCheckBoxController{
    @Override
    public String createOrderDetails(boolean isPizzaChecked, boolean isZomatoChecked) {
        int totalAmount = 0;
        String orderDetails = "Selected items";
        if (isPizzaChecked) {
            totalAmount += 100;
            orderDetails += "\nPizza : Rs.100";
        }
        if (isZomatoChecked) {
            totalAmount += 120;
            orderDetails += "\nZomato : Rs.120";
        }
        orderDetails += "\nTotal :Rs." + totalAmount;
        return orderDetails;
    }
}
