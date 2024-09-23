package Sept.ex_23092024;

public class Task_convert_km {
    public static void main(String[] args){
        //Write a program that converts between different units
        // (e.g., kilometers to miles, Celsius to Fahrenheit)
        // based on user selection using a switch statement.
        //Input. -
        //choice - 1 - km → m, m → km
        //choice - 2 - f → c, c → f
        double km = 2;
        double m = 2000;
        double f = 32;
        double c = 0;
        int convert1 = 3;
        int convert2 = 3;
        switch (convert1){
            case 1 :
                System.out.println(km*1000);
                break;
            case 2:
                System.out.println(m/1000);
                break;
            default:
                System.out.println("Good Conversion");
        }
        switch (convert2){
            case 1 :
                System.out.println((f-32)*5/9);
                break;
            case 2:
                System.out.println((c*5/9)+32);
                break;
            default :
                System.out.println("They are no values no convert");
        }
    }
}
