package com.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ShopList{



    public static void main(String[] args) {

        class sortPay implements Comparator<Shop> {
            public int compare(Shop s1, Shop s2) {
                return Double.compare(s2.getAmount(), s1.getAmount());

            }
        }

        Shop inv1 = new Shop(25.50, 21);
        Shop inv2 = new Shop(27.75, 15);
        Shop inv3 = new Shop(22.00, 18);



        ArrayList<Shop> ShopArraylist = new ArrayList<Shop>();


        ShopArraylist.add(inv1);
        ShopArraylist.add(inv2);
        ShopArraylist.add(inv3);

        Collections.sort(ShopArraylist, new sortPay());


        System.out.println(ShopArraylist.toString());
        JOptionPane.showMessageDialog(null, ShopArraylist.toString());



    }

}