package test.task.day20;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Test {
    public static void main(String[] args) throws Exception{
        String sourceUrl = "src/main/java/test/task/day20/1.png";
        String targetUrl = "src/main/java/test/task/day20/png/1.png";
        File file = new File(sourceUrl);
        File direction = new File(targetUrl);
        Path sourcePath = file.toPath();
        Path targetPath = direction.toPath();
        try{
            Files.move(sourcePath,targetPath,StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
