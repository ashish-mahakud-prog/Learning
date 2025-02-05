package leetcodeProblems;

import java.util.*;

public class ClosestToZero {

    static void closestToZero(int[] arr){
        System.out.println("enter values for the array");
        Scanner s =new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] =s.nextInt();
        }
        System.out.println("entered array is --> "+ Arrays.toString(arr));

        int distance =arr[0];
        HashMap<Integer, Integer> map =new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]) <= Math.abs(distance)){
                distance = arr[i];
                map.put(arr[i],Math.abs(arr[i]) );
            }
        }

        if(distance < 0 && map.containsKey(Math.abs(distance))){
            distance = Math.abs(distance);
        }
        System.out.println(map);
        System.out.println(distance);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        closestToZero(arr);
    }
}
