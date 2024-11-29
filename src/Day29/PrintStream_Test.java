package Day29;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStream_Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps= new PrintStream("read.txt");
        System.out.println("hello");
        System.setOut(ps);
        System.out.println("world");
    }
}
