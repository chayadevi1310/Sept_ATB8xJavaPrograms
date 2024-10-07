package Oct.ex_04102024;

public class AHuman {

    String eyes_color;
    String planet;
    String name;
    long aadhar_card_number;

    //Default constructor
    AHuman(){
        System.out.println("I will be called when object is created");
        // We can write a Code here which will automatically called when Object is created
        // We can write a Code to Read a File txt
        // We can write a Code to Read a CSV, Excel here. ...
    }
    //Parameterized constructor
    AHuman(String name){
        System.out.println("Hi, I am Param Constructors");
        this.name = name;
    }
    //Return - void, data-type
    void walk(){
        System.out.println("No Return also no argument");
    }
    int talk(){
        System.out.println("Return type with no argument");
        return 10;
    }
    String sleep(String name){
        System.out.println("Sleeping");
        System.out.println("Return type with arguments");
        return "I am sleeping";
    }
    void eat(String name){
        System.out.println("No return type but with arguments");
        System.out.println("Eating");
    }

}
