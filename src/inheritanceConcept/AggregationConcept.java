package inheritanceConcept;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 class Details{
    Person man;

    void printPerson(Person person){
        System.out.println(person.name +" "+person.age);
    }
}
public class AggregationConcept {
    public static void main(String[] args) {
        Person p =new Person("Ashish",28);
        Details d = new Details();
        d.man =p;
        d.printPerson(d.man);

    }
}
