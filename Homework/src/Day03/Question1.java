package Day03;

public class Question1 {
    public static void main(String[] args){
        double fa = 177;
        double mo = 165;
        double son = (fa + mo )*1.08 /2;
        double da = (fa*0.923 + mo )/2;
        System.out.println("儿子"+son);
        System.out.println("女儿"+da);
    }
}
