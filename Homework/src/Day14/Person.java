package Day14;

public class Person {
    private String name;
    private int age;
    public void keepPet(Animal animal,String something){
        //多态的运用 关键词instanceof
        if (animal instanceof Dog){
            System.out.println('D');
        } else if (animal instanceof Cat) {
            System.out.println('C');
        }
        animal.eat(something);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
}
