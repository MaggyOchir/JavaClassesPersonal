package org.example.review2;

import java.sql.SQLOutput;

public class E8NestedIfStatement {
    public static void main(String[] args) {
    boolean haveCoupon=true;
    int coupon=20;
        System.out.println(1);
    if(haveCoupon){System.out.println(2);
    if (coupon==10){System.out.println(3);
    }else if(coupon==20){System.out.println(4);
    }else System.out.println(5);}
    System.out.println(6);
    System.out.println(7);

}}
