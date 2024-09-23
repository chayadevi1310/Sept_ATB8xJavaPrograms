package Sept.ex_23092024;

public class Task_cal_switch {
public static void main(String[] args){
    //Create a simple calculator that performs
    // addition, subtraction, multiplication, and division,
    // modus based on user input using switch statements.
          //  Inputs :   num 1, num 2, +
          //  Output :  num1+num2 → print information.
    double num1 = 4;
    double num2 = 8;
char op = '+';
    switch(op) {
        case '+':
            System.out.println(4+8);
            break;
        case '-':
            System.out.println(4-8);
            break;
            case '*':
                System.out.println(4*8);
                break;
        case '/':
            System.out.println(4/8);
            break;
        case '%':
            System.out.println(4%8);
            break;

    }

}
}
