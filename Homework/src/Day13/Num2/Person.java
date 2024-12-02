package Day13.Num2;

public class Person {
    private String name;
    private int age;
    public static int sb=10;
    public Person(){}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void view(){
        System.out.println('1');
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
