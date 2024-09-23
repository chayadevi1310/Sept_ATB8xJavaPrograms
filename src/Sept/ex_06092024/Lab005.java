package Sept.ex_06092024;

public class Lab005 {
public static void main(String[] args){
    System.out.println("Hello World!");
    main("Pramod");// this main is executable for next main program only
}
public static void main(String args){
  System.out.println("Hello World!");
}
public void main(int args){//this is not executable by java as it has int args
  System.out.println("Hello World!");
}
}
