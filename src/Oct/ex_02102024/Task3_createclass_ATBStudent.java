package Oct.ex_02102024;

public class Task3_createclass_ATBStudent {
    //Create a Class  ATBStudent and 5 Objects - (A/B) - github.com
    public static void main(String[] args){

        ATBStudent vinod = new ATBStudent();
        vinod.sid = "ATB02345";

        System.out.println(vinod);
        System.out.println(vinod.sid);

        ATBStudent Mercy = new ATBStudent();
        Mercy.batch8x = 8;

        System.out.println(Mercy);
        System.out.println(Mercy.batch8x);

        ATBStudent Nancy = new ATBStudent();
        Nancy.email = "nancy.raj@gmail.com";

        System.out.println(Nancy);
        System.out.println(Nancy.email);

        ATBStudent Anne = new ATBStudent();
        Anne.age = 21;

        System.out.println(Anne);
        System.out.println(Anne.age);

        ATBStudent Sam = new ATBStudent();
        Sam.phone = 123456789;

        System.out.println(Sam);
        System.out.println(Sam.phone);
    }

}
