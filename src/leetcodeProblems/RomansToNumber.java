package leetcodeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class RomansToNumber {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        HashMap<Character,Integer> romanNumberValue =new HashMap<>();
        romanNumberValue.put('I',1);
        romanNumberValue.put('V',5);
        romanNumberValue.put('X',10);
        romanNumberValue.put('L',50);
        romanNumberValue.put('C',100);
        romanNumberValue.put('D',500);
        romanNumberValue.put('M',1000);

        System.out.println("enter the roman number");
        String roman = s.next();

        int number=0;
        for (int i = roman.length()-1; i >= 0; i--) {

            switch (roman.charAt(i)){
                case 'I' -> number = number+ romanNumberValue.get(roman.charAt(i));
                case 'V', 'X' ->{
                    if(i != 0){
                         char ch = roman.charAt(i-1);
                         if(ch == 'I'){
                             number= number + romanNumberValue.get(roman.charAt(i)) - romanNumberValue.get('I');
                         }else number = number+ romanNumberValue.get(roman.charAt(i));
                    }
                    --i;
                }
                case 'L', 'C' ->{
                    if(i != 0){
                        char ch = roman.charAt(i-1);
                        if(ch == 'X'){
                            number= number + romanNumberValue.get(roman.charAt(i)) - romanNumberValue.get('X');
                        }}else number = number+ romanNumberValue.get(roman.charAt(i));

                    --i;
                }
                case 'D', 'M' ->{
                    if(i != 0){
                        char ch = roman.charAt(i-1);
                        if(ch == 'C'){
                            number= number + romanNumberValue.get(roman.charAt(i)) - romanNumberValue.get('C');
                        }}else number = number+ romanNumberValue.get(roman.charAt(i));
                    --i;
                }


            }




        }

        System.out.println("number is -> "+number);
    }
}
