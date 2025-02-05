package leetcodeProblems;

public class MaxProfit {

    //optimised code
    static int profit(int[] arr){
        int profit =0;
        int bp =arr[0];


        int i=1;
        while (i<arr.length){
            int sp = arr[i];
            //if sp is less than bp
            if ( sp < bp){
                bp = sp;
            }
            //if bp is less than sp
            if (bp < sp){
                if ((sp -bp) > profit){
                profit = sp-bp;}

            }
            i++;
        }


        return profit;
    }


    public static void main(String[] args) {
        int[] price = {7,6,4,3,1,10,20,2,3,7};

        int profit = 0;
        int buyDay ,sellDay = 0;

        for (int i = 0; i< price.length-2;i++){

            for (int j = i+1; j < price.length; j++) {

                int diff = price[i] -price[j];
                if (diff < profit) profit=diff;

            }
        }


        System.out.println(Math.abs(profit));

        int profit1 = profit(price);
        System.out.println(profit1);

    }
}
