package Day15.Num5;

public class Test {
    public static void main(String[] args) {
        A a =new A();
        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("show");
            }
        });
    }

}
//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}
