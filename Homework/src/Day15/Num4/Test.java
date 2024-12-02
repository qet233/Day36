package Day15.Num4;

interface Inter {
    void show();
}
class Outer {
    public static Inter method(){
        class Show implements Inter{
            @Override
            public void show() {
                System.out.println("Hello,world");
            }
        }
        return new Show();
    }
}
public class Test {
    public static void main(String[] args) {
        Outer.method().show();
    }
}
