package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作 1登录 2注册 3忘记密码 4离开");
            String choose = sc.next();
            switch (choose){
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("exit");
                    System.exit(0);
                }
                default -> System.out.println("没用这个功能");
            }
        }
    }

    private static void forgetPassword(ArrayList<User> list) {

    }

    private static void register(ArrayList<User> list) {

    }

    private static void login(ArrayList<User> list) {

    }
}
