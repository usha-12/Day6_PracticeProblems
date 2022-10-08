package Bridgelabz.Com.JUnitTesting;
public class SqrtNewtonProgram {
     static void Sqrt(){
        double c = Double.parseDouble("");
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t-c/t) > epsilon*t){
            t = (c/t+t)/2.0;
        }
        System.out.println(t);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Sqrt Newton Method program");
        Sqrt();
    }
}
