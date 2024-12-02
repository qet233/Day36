package Day14;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("年龄为"+ getAge()+"颜色为"+getColor()+"的猫正在抓老鼠");
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"猫眯着眼睛侧着头吃"+something);
    }
}
