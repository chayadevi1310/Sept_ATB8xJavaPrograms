package Sept.ex_25092024;
import java.util.Scanner;
public class Task04_count_vowels {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String");
        String name = sc.nextLine();
        //System.out.println(name);
        int vowels = 0, consonants = 0;
        for(int i = 0;i< name.length();i++){
            char ch = name.charAt(i);
            //System.out.println(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' ||ch =='u'){
                ++vowels;
            }
            else if(ch>='a' && ch<='z'){
                ++consonants;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
