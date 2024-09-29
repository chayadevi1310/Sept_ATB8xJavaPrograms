package Sept.ex_30092024;

import java.util.Scanner;
public class Task1_fact_usingfunctions {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");
        int num = sc.nextInt();
        int fact = factorial(num);//calling without parameter and with return value
        System.out.println("factorial of " +num + " is "+fact);
    }
    public static int factorial(int num){
        int fact=1,i;
        for (i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
