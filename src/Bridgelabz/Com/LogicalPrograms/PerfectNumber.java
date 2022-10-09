package Bridgelabz.Com.LogicalPrograms;

public class PerfectNumber {
    public static void checkPerfectNumber(){
        int number = 28;//1, 2, 4, 7, 14, 28
        int sum = 0;
        for (int i = 1; i<number; i++){
            if (number % i == 0)
                sum = sum + i;
        }
        if (sum == number)
            System.out.println("Number is Perfect:"+number);
        else
            System.out.println("Number is not Perfect:"+number);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the perfect Number Program:");
        checkPerfectNumber();
    }
}
//Perfect Number
//a. Just like the Armstrong number, the Perfect Number is also a special type of
//positive number. When the number is equal to the sum of its positive divisors
//excluding the number, it is called a Perfect Number. For example, 28 is the perfect
//number because when we sum the divisors of 28, it will result in the same number.
//The divisors of 28 are 1, 2, 4, 7, and 14. So,
//b. 28 = 1+2+4+7
//c. 28 = 28
