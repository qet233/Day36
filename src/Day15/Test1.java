package Day15;

public class Test1 {
    interface Swim {
        public abstract void swimming();
    }

        public static void main(String[] args) {
            // 匿名内部类使用场景:作为方法参数传递
            Swim s3 = new Swim() {
                @Override
                public void swimming() {
                    System.out.println("蝶泳...");
                }
            };
            // 传入匿名内部类
            goSwimming(s3);

            // 完美方案: 一步到位
            goSwimming(new Swim() {
                public void swimming() {
                    System.out.println("大学生, 蛙泳...");
                }
            });

            goSwimming(new Swim() {
                public void swimming() {
                    System.out.println("小学生, 自由泳...");
                }
            });
        }

        // 定义一个方法,模拟请一些人去游泳
        public static void goSwimming(Swim s) {
            s.swimming();
        }
    }
