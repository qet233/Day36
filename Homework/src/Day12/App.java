package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<User>();
        while (true) {
            System.out.println("welcome");
            System.out.println("1.dl 2. zc 3. wjmm");

            String choose = sc.next();
            switch(choose){
                case "1":
                    login();
                    break;
                case "2":
                    register(list);
                    break;
                case "3":
                    forgetPassword();
                    break;
                case "4":
                    System.out.println("tc");
                    System.exit(0);
                default:
                    System.out.println("none");

            }
        }

    }

    private static void forgetPassword() {
        System.out.println("wjmm");
    }

    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String username = sc.next();
            boolean flag1= checkUsername(username);
            if (!flag1){
                System.out.println('n');
                continue;
            }
            boolean flag2 =contains(list,username);
            if(flag2){
                System.out.println(username+"cz");
                continue;
            } else {
                System.out.println(username+"ky");
                break;
            }

        }
        //
        while (true) {
            String password = sc.next();
            String againPassword = sc.next();
            if (!password.equals(againPassword)){
                continue;
            } else {
                break;
            }
        }
        while (true) {
            String personID = sc.next();
            boolean flag3 = checkPersonID(personID);
            if(flag3){
                break;
            }else{
                continue;
            }
        }
    }

    private static boolean checkPersonID(String personID) {
        if (personID.length()!=18){
            return false;
        }
        if (personID.startsWith("0")){
            return false;
        }
        for (int i = 0; i < personID.length()-1; i++) {
            char c = personID.charAt(i);
            if(!(c>='0'&&c<='9')){
                return false;
            }
        }
        char endChar = personID.charAt(personID.length() - 1);
        if((endChar>='0'&&endChar<='9')||(endChar=='x')||(endChar=='X')){
            return true;
        }else{
            return false;
        }
    }

    private static  boolean contains(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if(rightUsername.equals(username)){
                return true;
            }
        }
        return false;
    }
    private static boolean checkUsername(String username) {
        int len = username.length();
        if (len <3 || len >15){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))){
                return false;
            }
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                return true;
            }
        }
        return false;
    }

    private static void login() {
        System.out.println("dl");
    }
}
