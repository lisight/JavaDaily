package test.task.day19.task01;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File directory = new File("src\\main\\java\\test\\task\\day19\\task01");
        System.out.println(directory);
//        File directory2 = new File(".\\");
        File[] files = directory.listFiles();
        for(File file:files)
            System.out.println(file.getName());
    }
}
