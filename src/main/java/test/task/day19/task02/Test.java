package test.task.day19.task02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Arrays.asList(
                "src/main/java/test/task/day19/task02/test01/File类操作.avi",
                "src/main/java/test/task/day19/task02/test01/File 学习笔记.md",
                "src/main/java/test/task/day19/task02/test02/java学院-讲师上云-日期讲解.avi",
                "src/main/java/test/task/day19/task02/test02/java学院-讲师上云-日期解析.avi",
                "src/main/java/test/task/day19/task02/任务作业.txt",
                "src/main/java/test/task/day19/task02/test02/02/01/1.txt"
        ));
        for(String url : data){
            File file= new File(url);
            File parentDirectory = file.getParentFile();
            if (!parentDirectory.exists()) {
                parentDirectory.mkdirs();
                System.out.println("创建目录：" + parentDirectory);
            }
            try {
                if (file.createNewFile()) {
                    System.out.println("创建文件：" + url);
                } else {
                    System.out.println("文件已存在：" + url);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
