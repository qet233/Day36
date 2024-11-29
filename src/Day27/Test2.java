package Day27;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFriend gf = new GirlFriend();
        try {
            System.out.println("输入名字");
            String name = sc.nextLine();
            gf.setName(name);
            System.out.println("输入年龄");
            int age = Integer.parseInt(sc.nextLine());
            gf.setAge(age);
            System.out.println(gf);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

    }
}
