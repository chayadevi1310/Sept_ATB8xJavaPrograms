package Sept.ex_30092024;

import java.util.Scanner;

public class Task3_Vowel_consonant_funct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.nextLine();
        vowel_consonant(name);
    }
    public static void vowel_consonant(String name){
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
