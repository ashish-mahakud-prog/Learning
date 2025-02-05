package leetcodeProblems;

import java.util.HashMap;

public class AnagramStrings {
    public static void main(String[] args) {
   String str1 =new String("mellow");
        String str2 =new String("jellow");

        HashMap<Character, Integer> map =new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 =new HashMap<Character, Integer>();

        if (str1.length() != str2.length()) System.out.println("not anagram");;


        for (int i = 0; i <str1.length() ; i++) {
            if (map.containsKey(str1.charAt(i))){
                var val = map.get(str1.charAt(i));
            map.put(str1.charAt(i),val+1);

            }
            else  map.put(str1.charAt(i), 1);
        }

        for (int i = 0; i <str2.length() ; i++) {
            if (map2.containsKey(str2.charAt(i))){
                var val = map2.get(str2.charAt(i));
                map2.put(str2.charAt(i),val+1);

            }
            else  map2.put(str2.charAt(i), 1);
        }

        System.out.println(map+" "+map2);

        System.out.println(map.equals(map2));

    }
}
