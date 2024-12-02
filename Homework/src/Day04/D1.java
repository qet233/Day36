package Day04;

public class D1 {
    public static void main(String[] args){
        double paper = 0.1;
        int sum =0;
        while(paper<8844430){
            paper*=2;
            sum++;
        }
        System.out.println(sum);
    }
}
