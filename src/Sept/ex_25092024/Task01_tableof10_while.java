package Sept.ex_25092024;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task01_tableof10_while {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        System.out.println("Table of " + num1);
        System.out.println();
        int j = 1;
        while(j<=10){
            System.out.println(num1 + "X" +j +"=" +(num1*j));
            j++;
        }
    }
}
