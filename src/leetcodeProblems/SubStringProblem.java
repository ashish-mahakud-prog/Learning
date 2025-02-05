package leetcodeProblems;

public class SubStringProblem {
    public static void main(String[] args) {

       String sub = "axc";
       String sequence = "ahbdgc";

       int num = 0;
       int start= 0;
        for (int i = 0; i < sub.length(); i++) {

            for (int j = start; j < sequence.length(); j++) {
                if (sub.charAt(i) == sequence.charAt(j)){
                    num += 1;
                    start=j;
                    break;
                }

            }

        }

        System.out.println(num);
        if (num == sub.length()) System.out.println("sub-sequence");

    }
}
