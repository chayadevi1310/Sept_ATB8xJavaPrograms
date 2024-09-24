package Sept.ex_20092024;

public class Task_Ternary_grade {
    public static void main(String[] args){
      //  Ternary Operators to handle multiple conditions.
// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
        int score = 85;
        char grade = 'F' ;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        }
         else if (score <= 0 || score > 100) {
            System.out.println("LOL!!, are you God?");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is -> "+ grade);

    }
}
