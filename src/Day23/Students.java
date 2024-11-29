package Day23;

import java.util.Objects;

public class Students implements Comparable<Students>{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Students() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Students o) {
        int r = this.age -o.age;
        r=r==0?this.name.compareTo(o.name):r;
        return r;
    }
}
