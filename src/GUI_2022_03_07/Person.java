package GUI_2022_03_07;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public static void sayHelloTo(Person person){
        System.out.println("Hi " + person.name + "!");
    }
}
