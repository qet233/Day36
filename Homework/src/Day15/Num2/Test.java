package Day15.Num2;

public class Test {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        NewPhone np = new NewPhone();
        usePhone(op);
        usePhone(np);
    }
    public static void usePhone(Phone phone){
        phone.takePhone();
        phone.takeMess();
        if (phone instanceof NewPhone newPhone){
            newPhone.playGame();
        }
    }
}
