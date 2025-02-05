package leetcodeProblems;

import java.util.Arrays;

public class ProductOfArray {

    static int leftSide(int index ,int[] arr){
        int res =1;

        for (int i = 0; i < index; i++) {
            res =res*arr[i];
        }

        return res;
    }

    static int rightSide(int index, int[] arr){
int res =1;

        for (int i = index+1; i < arr.length; i++) {
            res =res*arr[i];
        }

return res;
    }

    public static void main(String[] args) {

        int[] arr ={-1,1,0,-3,3};
        int[] products =new int[arr.length];

        if (arr.length == 0){
            System.out.println("array is empty");
        }


        int firstIndexProduct =1;
        for (int i = 1; i < arr.length; i++) {
        firstIndexProduct = firstIndexProduct*arr[i];
        }


        int lastIndexProduct =1;
        for (int i = 0; i < arr.length-1; i++) {
            lastIndexProduct = lastIndexProduct*arr[i];
        }

//calculate products
        for (int i = 0; i < arr.length; i++) {

            if (i == 0 ){
                products[0] =firstIndexProduct;
            }else if (i ==arr.length-1){
                products[products.length-1] =lastIndexProduct;
            }else if (i == 1 ){
                int res = arr[0]*rightSide(i ,arr);
                products[i]=res;
            }else if (i == arr.length-2 ){
                int res = arr[arr.length-1]*leftSide(i ,arr);
                products[i]=res;
            }else{
                int res=leftSide(i,arr)*rightSide(i,arr);
                products[i]=res;
            }





        }

        System.out.println(Arrays.toString(products));



    }
}
