package leetcodeProblems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class SimpleTestCode {

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

       if (false){
           int res = 20 %10;
           System.out.println(res);

           BigInteger num =BigInteger.valueOf(30);
           BigInteger gcd1 = num.gcd(BigInteger.valueOf(20));
           System.out.println("-------->");
           System.out.println(gcd1);


           int gcd = findGCD(30, 20);
           System.out.println(gcd);

           BigInteger num2=BigInteger.valueOf(600);
           BigInteger lcm =  num2.divide(gcd1);
           System.out.println(lcm);

       }

       char ch = '2';
       String ch2 =String.valueOf(ch);

       int newNum = Integer.parseInt(ch2);
        System.out.println(newNum);

       String s ="to char array";
       String s2 ="";
       char[] strArr = s.toCharArray();
        



    }
}
