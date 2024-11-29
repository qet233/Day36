package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            Student stu= new Student(name,age);
            list.add(stu);
        }
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
        Student stu1 = new Student();
    }
}
