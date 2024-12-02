package Day13.num5;

public class Person {
    private String name;
    private int age;
    private int salary;

    public Person() {
    }

    public Person(String name, int age,int salary) {
        this.name = name;
        this.age = age;
        this.salary=salary;
    }

    public void work(){
        System.out.println("work!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}