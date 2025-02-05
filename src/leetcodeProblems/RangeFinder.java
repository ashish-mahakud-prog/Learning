package leetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RangeFinder {

    public static void main(String[] args) {

        int[] arr = {0,1,2,4,5,7};

        int start= arr[0];
       int end =arr[0];

        List<String> range = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            start = arr[i];

            while(i<arr.length-1 && arr[i+1] == (arr[i]+1)){
               end = arr[i+1];
               i++;

            }

            if (start == end || i ==arr.length-1){
                String toString = String.valueOf(start);
                range.add(toString);
            }else {
                String toString = String.valueOf(start)+" -> "+String.valueOf(end);
                range.add(toString);
            }



        }

        System.out.println(Arrays.asList(range));


    }




}
