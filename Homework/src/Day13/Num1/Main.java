package Day13.Num1;

public class Main {
    public static void main(String[] args) {
                Zi z = new Zi();
                System.out.println(z.num1);
                System.out.println(z.getNum2());
                // System.out.println(z.num2);
                // 私有的子类无法使用
                // 通过getter/setter方法访问父类的private成员变量
                System.out.println(z.getNum2());

                z.show1();
                // z.show2(); // 私有的子类无法使用
            }
        }



