package Day13.num5;

public class Manager extends Person {
    private int money;

    public Manager() {
    }

    public Manager(String name, int age, int salary, int money) {
        super(name, age, salary);
        this.money = money;
    }
    @Override
    public void work(){
        System.out.println("work as a manager!");
        System.out.println(money+ getSalary());
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
