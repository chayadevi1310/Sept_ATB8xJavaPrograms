package Sept.ex_27092024;
import java.util.Scanner;
public class Task3_sumof1to100_while {
    public static void main(String[] args){
        //Write a Java program that calculates the sum of numbers
        // from 1 to 100 using a while loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println();
        int i = 1, count = 0;
        while(i<=num){
            count = count +i;
            i++;
        }
        System.out.println("Total sum : " +count);
    }
}
