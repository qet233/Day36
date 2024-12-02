package Day13.num5;

public class Programmer extends Person{
    public Programmer() {
    }

    public Programmer(String name, int age,int salary) {
        super(name, age,salary);
    }
    @Override
    public void work(){
        System.out.println("work as a Programmer!");
        System.out.println(getSalary());
    }
}
