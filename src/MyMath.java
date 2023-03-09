import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        int num1 = 24, num2 = 36;
        int gcf = findGCF(num1, num2);
        System.out.println("The GCF of " + num1 + " and " + num2 + " is " + gcf);
    }

    // Method to find the GCF using Euclid's algorithm
    public static int findGCF(int num1, int num2) {
        // Make sure num1 is the larger number
        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Apply Euclid's algorithm using a while loop and a conditional
        while (num2 != 0) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                int temp = num2;
                num2 = num1;
                num1 = temp;
            }
        }

        // The GCF is the last non-zero remainder which would be number 1
        return num1;
    }
}