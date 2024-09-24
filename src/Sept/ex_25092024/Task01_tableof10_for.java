package Sept.ex_25092024;

import java.util.Scanner;
public class Task01_tableof10_for {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number");
        int num = sc.nextInt();
        System.out.println("the table of  " + num);
        for(int i=1; i<=10; i++){
            System.out.println(num + "X" +i +"=" +(num*i));
        }

    }
}
