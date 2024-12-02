package Day14;

public class Dog extends Animal{
    Dog(){}
    Dog(int age ,String color){
        super(age,color);
    }
    public void lookHome(){
        System.out.println("年龄为"+ getAge()+"颜色为"+getColor()+"的狗正在看家");
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
}
