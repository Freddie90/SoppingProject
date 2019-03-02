package com.project.shop.serv.impl;

import com.project.shop.serv.ShoppingSevice;

public class ShoppingImpl implements ShoppingSevice {
    @Override
    public double calcPaymentAmount(double amount, double itemPrice)
    {

        double paymentDue;
        paymentDue = (amount * itemPrice);
        return paymentDue;
    }
}
