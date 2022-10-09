package Bridgelabz.Com.LogicalPrograms;

public class PrimeNumber {
    static boolean checkPrimeNumber(int number){
        boolean isPrime = true;
        for (int i =2; i < number; i++){
            if (number % i ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        boolean prime =  checkPrimeNumber(13);
        if (prime){
            System.out.println("prime");
        }else
            System.out.println("Not prime");
    }
}
//3. Prime Number
//Just like the Perfect number, the Prime number is also a special type of number. When
//the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//divided by 2, so 2 is the only even prime minister.