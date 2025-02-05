package leetcodeProblems;

import java.util.Scanner;

public class AlternateStringMerge {

    static void mergeString(){
        Scanner s =new Scanner(System.in);
        System.out.println("enter first word");
        String word1= s.next();
        System.out.println("enter second word");
        String word2= s.next();

        System.out.println("entered words are --> "+word1+" && "+word2);

        int len = Math.min(word1.length(), word2.length());
        System.out.println(len);
        StringBuilder string =new StringBuilder();
        for (int i = 0; i < len; i++) {
            string.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(word1.length() > word2.length())
            string.append(word1.substring(len));
        else string.append(word2.substring(len));

        System.out.println(string);
    }

    public static void main(String[] args) {

        mergeString();

    }
}
