package Day07;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("生成的验证码是：" + generateCode());
    }

    public static String generateCode() {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        // 前四位为随机字母
        for (int i = 0; i < 4; i++) {
            // 选择大写或小写字母
            code.append(random.nextBoolean()
                    ? (char) ('A' + random.nextInt(26))
                    : (char) ('a' + random.nextInt(26)));
        }

        // 最后一位为数字
        code.append(random.nextInt(10));

        return code.toString();
    }
}
