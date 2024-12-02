package Day15.Num3;

public class Test {
    public static void main(String[] args) {
        new Iplay() {
            @Override
            public void playGame() {
                System.out.println("玩游戏");
            }
        }.playGame();
        new Fun() {
            @Override
            public void fun() {
                System.out.println("玩乐");
            }
        }.fun();
    }
}
