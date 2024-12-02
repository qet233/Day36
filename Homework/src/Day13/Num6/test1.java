package Day13.Num6;

public class test1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(2,"黑色");
        Cat cat1 = new Cat(3,"白色");
        Person p1= new Person("张三",18);
        p1.keepPet(dog1,"骨头");
        p1.keepPet(cat1,"鱼肉");
    }
}
