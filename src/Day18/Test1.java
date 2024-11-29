package Day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String qq = "21521648";
        System.out.println(qq.matches("\\d{5,10}\\."));
        System.out.println("\"");
        String regex = "[1-9]\\d{5}(1[89]|20)\\d{2}(0[1-9]|1[012])(0[1-9]|3[01]|[12]\\d)\\d{3}((?i)x|\\d)";
        System.out.println("33108120040722691X".matches(regex));
        Pattern p = Pattern.compile("[1-9]\\d{5}(1[89]|20)\\d{2}(0[1-9]|1[012])(0[1-9]|3[01]|[12]\\d)\\d{3}((?i)x|\\d)");
        Matcher m = p.matcher("33108120040722691X");
        m.find();
        System.out.println(m.group());
    }
}
