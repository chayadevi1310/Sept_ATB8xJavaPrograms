package Sept.ex_20092024;

public class Task_Ternary_max {
    public static void main(String[] args){
       // By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c
        int a = 10;
        int b = 20;
        int c = 45;
        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
