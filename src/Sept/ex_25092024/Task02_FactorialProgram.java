package Sept.ex_25092024;

import java.util.Scanner;
public class Task02_FactorialProgram {
    public static void main(String[] args){
        //Factorial Program - n = 5 ,
        // Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
         // n = 1 ->  Fact = 1*1 -> 1
         // n = 3 -> Fact = 3*2*1 -> 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fact number ");
                int n = sc.nextInt();
        int fact = 1;
        System.out.println();
        for(int i = 1; i<=n; i++){
            fact = fact * i;

            System.out.println("The Factorial of " +n + " is " + fact);
        }
        System.out.println();
        int fact1 = 1;
int j = 1;
        while(j<=n){
            fact1 = fact1 * j;
            System.out.println("The Factorial of " + n + " is " + fact1);
            j++;

        }
        //System.out.println("The Factorial of " + n + " is " + fact1);

    }
}
