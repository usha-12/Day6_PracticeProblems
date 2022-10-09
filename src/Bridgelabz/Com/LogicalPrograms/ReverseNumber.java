package Bridgelabz.Com.LogicalPrograms;

public class ReverseNumber {
    public static void checkReverseNumber(int number){
        while (number>0){
            int reverse = number%10;
            number = number / 10;
            System.out.print(" "+reverse);
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse number program:");
        checkReverseNumber(12344);

    }
}
//4. Reverse a number
//In Java, we can reverse a number either by using for loop, while loop, or using recursion.
//The simplest way to reverse a number is by using for loop or while loop. In order to
//reverse a number, we have to follow the following steps:
//a. We need to calculate the remainder of the number using the modulo
//b. After that, we need to multiply the variable reverse by 10 and add the remainder into
//it.
//c. We then divide the number by 10 and repeat steps until the number becomes 0.
