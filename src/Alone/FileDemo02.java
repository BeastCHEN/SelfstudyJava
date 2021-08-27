package Alone;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------");
        File f2 = new File("E:\\itcast\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------");
        File f3 = new File("E:\\itcast\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("--------");
        File f4 = new File("E:\\itcast\\javase.txt");
        System.out.println(f4.createNewFile());
    }
}
