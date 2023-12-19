package test.task.day21.task01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class StudentSaveTest {

    public static boolean StudentSave(Student student){
        File file = new File(Student.DATA);
        Integer id ;
        try {
            // 使用 Files.readAllLines() 读取文件的所有行
            List<String> lines = Files.readAllLines(Student.DATA_PATH);
            // 遍历打印每一行内容
            for (String line : lines) {
                id = Integer.getInteger(line.substring(0,7));
                if(id == student.id)
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
