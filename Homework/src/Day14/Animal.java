package Day14;

public class Animal {
    private int age;
    private String color;

    public Animal() {
    }
    public void eat(String something){
        System.out.println(age+"岁的"+color+"颜色的动物在吃"+something);
    }
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
