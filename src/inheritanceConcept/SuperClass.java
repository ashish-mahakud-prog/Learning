package inheritanceConcept;

public class SuperClass {

    public int number = 10;
    protected int number2 = 20;
    private int number3= 30;
     String name = "liquid";

    public int add(int a,int b, int c){
        System.out.println("inside super !!");
        int sum = a+b+c;
        return sum;
    }

    int area(int num){
        System.out.println("superclass");
        int area = num*num;
        return area;
    }

}
