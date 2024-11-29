package Day29;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
//        Student student = new Student("老王", 27);
//        Student student2 = new Student("老张", 76);
//        Student student3 = new Student("老李", 72);
//        oos.writeObject(student);
//        oos.writeObject(student2);
//        oos.writeObject(student3);
//        oos.close();
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("list.txt"));
        Student s1= (Student) ois.readObject();
        Student s2=(Student)ois.readObject();
        Student s3=(Student)ois.readObject();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        ois.close();
    }
}
