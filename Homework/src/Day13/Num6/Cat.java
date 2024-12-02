package Day13.Num6;

public class Cat extends Animal{
    public Cat(int age , String color){
        super(age,color);
    }
    public void eat(String something){
        System.out.println("cat chi le"+something);
    }
    public void catchMouse(){
        System.out.println("mao zhua laoshu");
    }
}
