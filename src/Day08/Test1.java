package Day08;

class Student {
    private String name;
    private int age;
    
    //构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
/*
    测试类
 */
public class Test1 {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        s.show();
    }
}