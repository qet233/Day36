package Day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        Girl g1 = new Girl("cyx", 18, 1.73);
        Girl g2 = new Girl("cjj", 18, 1.85);
        Girl g3 = new Girl("cuy", 18, 1.63);
        Girl[] arr = {g1,g2,g3};
//        Arrays.sort(arr, new Comparator<Girl>() {
//            @Override
//            public int compare(Girl o1, Girl o2) {
//                double temp = o1.getAge() - o2.getAge();
//                temp = temp==0?o1.getHeight()-o2.getHeight():temp;
//                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;
//                if (temp>0){
//                    return 1;
//                } else if (temp==0){
//                    return 0;
//                } else{
//                    return -1;
//                }
//            }
//        });
        Arrays.sort(arr, (o1, o2) ->{
                double temp = o1.getAge() - o2.getAge();
                temp = temp==0?o1.getHeight()-o2.getHeight():temp;
                temp = temp==0?o1.getName().compareTo(o2.getName()):temp;
                if (temp>0){
                    return 1;
                } else if (temp==0){
                    return 0;
                } else{
                    return -1;
                }
            }
        );
        System.out.println(Arrays.toString(arr));
    }
}
class Girl{
    private String name;
    private int age;
    private double height;

    public Girl() {
    }

    public Girl(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age && Double.compare(girl.height, height) == 0 && Objects.equals(name, girl.name);
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
