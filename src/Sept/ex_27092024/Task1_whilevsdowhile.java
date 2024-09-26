package Sept.ex_27092024;

public class Task1_whilevsdowhile {
    public static void main(String[] args){
//Give me example of while vs do while loop in Lab ex
        int i = 0,j =0;
        while(i<0){
            System.out.println("Count1 : " +i);
            i++;
        }
        // in while loop it first executing the condition then entering into the body
        do{
            System.out.println("Count2 : "+j);
            j++;
        }while(j<0);
        // in do while it first executing the body and then checking the condition
    }
    // here we are getting output for do while itself as its executing the body first whereas
    // in while loop first it checking the condition for the given variable.
}
