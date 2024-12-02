package Day14;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18 );
        Dog dog1 =new Dog(2,"黄色");
        Cat cat1 =new Cat(1,"白色");
        p1.keepPet(dog1,"骨头");
        p1.keepPet(cat1,"🐟");
        dog1.lookHome();
        cat1.catchMouse();
        eat(dog1,"骨头");
        eat(cat1,"🐟");
    }
    public static void eat(Animal animal, String something){
        animal.eat(something);
    }
}
