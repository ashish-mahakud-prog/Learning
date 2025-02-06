package inheritanceConcept;

public class SubClass extends SuperClass{

    int number =100;
    int num2 =200;
    int num3 =300;

    double area(double num){
        System.out.println("subclass");
        double area = Math.PI * num * num;
        return area;

    }

    int area(int num){
        System.out.println("inside subclass");
      return  super.area(num);
    }

    public static void main(String[] args) {
        SubClass sub =new SubClass();

        System.out.println(sub.add(sub.number, sub.num2, sub.num3));
        System.out.println(sub.add(sub.number, sub.number2, sub.num3));

        System.out.println(sub.area(10.2));
        System.out.println(sub.area(30));
        System.out.println(sub.name);

    }
}
