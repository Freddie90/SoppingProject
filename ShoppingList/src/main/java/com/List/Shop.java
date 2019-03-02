package com.List;

public class Shop {

    private double itemPrice;
    private int amount;


    public Shop()
    {
    }

    public Shop(double price, int amoun)
    {
        itemPrice = price;
        amount = amoun;
    }


    public void setItemPrice(double price)
    {
        itemPrice = price;
    }

    public void setAmount(int amoun)
    {
        amount = amoun;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public int getAmount()
    {
        return amount;
    }

    public double calcPaymentAmount()
    {
        double paymentDue;
        paymentDue = (amount * itemPrice);
        return paymentDue;
    }


}
