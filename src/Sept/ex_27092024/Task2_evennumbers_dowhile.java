package Sept.ex_27092024;

public class Task2_evennumbers_dowhile {
    public static void main(String[] args) {
        //Create a Java program that prints the first 5 even numbers using a do-while loop.
        int i = 2;
        do {
            if (i %2 == 0) {
                System.out.println("First five even numbers are " + i);
            }
            i++;
        } while (i<=10);
    }
}
