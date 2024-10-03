package Oct.ex_02102024;

//import sept.Person;// person is in another folder(sept) so we need to import for execution
import java.util.Scanner;//Scanner is in java.util folder so we are importing
public class Lab124 {
    public static void main(String[] args){
        // Object Class - OOps
        // String Class - Reference type
        // Arrays
        // for each
        // 2d nested for loop

        // Class -> Blueprint to create something
        // Objects - Instance of the class - created from the class.
        ATBStudent amit = new ATBStudent();
        // ATBStudent -- class name
        // amit is reference to the object
        //new ATBStudent--- object creation
        // new -- memory allocation
        //JVM -- class loaders and heap
        // class name will store in class loaders
        // heap stores the attribute and behaviour
        amit.age = 35;// age is a attribute and 35 is its value

        ATBStudent abhishek = new ATBStudent();
        abhishek.age = 65;

        System.out.println(amit);//ATBStudent@6acbcfc0
        System.out.println(abhishek);//ATBStudent@5f184fc6

        // abhishek - Ref VARAIBLE - bYTE, ir bits ->  8, 64, null default value
    }
}
