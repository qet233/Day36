package Day13.num5;
public class test5 {
    public static void main(String[] args) {
        Programmer pg = new Programmer("A",1,5000);
        pg.work();
        Manager ma = new Manager("A",1,5000,10000);
        ma.work();
    }
}
