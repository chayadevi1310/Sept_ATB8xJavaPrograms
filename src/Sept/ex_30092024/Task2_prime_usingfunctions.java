package Sept.ex_30092024;

import java.util.Scanner;
public class Task2_prime_usingfunctions {
    public static void main(String[] args) {
        //prime numbers from 1 to 100 using functions
        prime();
    }
    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println();
        for (int i = 2; i <= num; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.println(i + " ");
            }
        }
    }
}
