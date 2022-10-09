package Bridgelabz.Com.LogicalPrograms;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        String str = " ";

        System.out.println("Welcome to the coupon number program");
        System.out.println("Enter the number of coupon to be generated :");
        Scanner sc = new Scanner(System.in);
        int coupons = sc.nextInt();
        String[] couponArray = new String[coupons];
        System.out.println();
        for (int counter = 0; counter < coupons; counter++){
            str = generateCoupon(str);
            System.out.println("Coupon Number "+(counter+1)+" :   "+str);
        }
        sc.close();
    }
    static  String generateCoupon(String str){
        for (int counter = 0; counter <= 4; counter++){
            int randomDigit = (int)(Math.random()*10);
            str = str + randomDigit;
        }
        String checkedDuplicacy = generateCoupon(str);
        return checkedDuplicacy;
    }
    static String checkCoupons(String newCoupon){
        int check = 0;
        String[] couponArray = new String[5];
        for (String existing : couponArray)
            if (newCoupon == existing)
                check++;
        if (check != 0)
            generateCoupon("usha");
        return newCoupon;
    }
}
