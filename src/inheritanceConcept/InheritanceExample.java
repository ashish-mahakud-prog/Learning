package inheritanceConcept;

public class InheritanceExample implements MyMethods{

    @Override
    public void print() {
        System.out.println("this is my implementation");
    }

    @Override
    public int calculateAdd(int a, int b) {
        int sum = a+b;
        System.out.println("the sum is: ");
        return sum;

    }

    public static void main(String[] args) {
        InheritanceExample in =new InheritanceExample();
        in.print();
        System.out.println(in.calculateAdd(5,10));

}}
