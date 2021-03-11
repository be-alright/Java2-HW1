package com.cindy;

public class Customer {
    String id;
    int sellingprice;
    int discount;
    int discountprice;

    public Customer(String id, int sellingprice, int discount, int discountprice) {
        this.id = id;
        this.sellingprice = sellingprice;
        this.discount = discount;
        this.discountprice = discountprice;
    }

    public void print() {

        if (discount < 100) {
            System.out.println(id + "\t" + sellingprice + "\t" + "\t" + discount + "\t" + discountprice);
        } else {
            System.out.println(id + "\t" + sellingprice + "\t" + discount + "\t" + discountprice);
        }

    }
}