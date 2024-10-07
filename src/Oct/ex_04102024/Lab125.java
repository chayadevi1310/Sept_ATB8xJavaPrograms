package Oct.ex_04102024;

public class Lab125 {
    public static void main(String[] args){

        AHuman amit = new AHuman();
        AHuman ajai = new AHuman("Ajai");
        AHuman joseph = new AHuman("joseph");
        System.out.println(amit.planet);
        System.out.println(joseph.planet);

        System.out.println(amit.name);
        System.out.println(ajai.name);
        System.out.println(joseph.name);

    }
}
