package Day13.Num2;

public class test2 {
    public static void main(String[] args) {
        Students st = new Students("张三",18,"小三");
        System.out.println(st.getName());
        System.out.println(st.classNum);
        st.write();
        System.out.println(Person.sb);
        System.out.println(Students.sb);
    }
}
