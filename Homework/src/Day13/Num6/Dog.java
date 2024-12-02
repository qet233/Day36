package Day13.Num6;

public class Dog extends Animal{
    public Dog(int age,String color) {
        super(age,color);
    }

    public void eat(String something){
        System.out.println("dog chi le"+something);
    }
    public void lookHome(){
        System.out.println("dog kan jia");
    }
}
