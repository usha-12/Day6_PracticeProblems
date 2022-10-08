package Bridgelabz.Com.LogicalPrograms;

public class FibonacciSeries {
    public static void checkFibonacciSeries(int number){
        int firstNo = 0;
        int secondNo = 1;
        for (int i =1; i<=number; i++){
            System.out.println(firstNo);
            int last2NoStore = firstNo+secondNo;//1-2
            firstNo = secondNo;//assign the value secondNo to firstNo
            secondNo = last2NoStore;
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Fibonacci Series program");
        checkFibonacciSeries(28);

    }
}
/*Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).*/