package Bridgelabz.Com.JUnitTesting;

public class ToBinary {
    static void checkBinary(int num) {
        int binary[] = new int[100];
        int i = 0;
        while (num > 0) {
            int remainder = num % 2;
            binary[i++] = remainder;
            num = num / 2;
        }
        for (int j = i-1; j>=0; j--){
            System.out.print(binary[j]+ "");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to convert binary number");
        checkBinary(106);

    }
}
