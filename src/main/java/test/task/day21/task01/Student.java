package test.task.day21.task01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Student {
    final static String URL = "src/main/java/test/task/day21/task01/";
    final static String DATA = URL+"Students.txt";
    final static Path URL_PATH = Paths.get(URL);
    final static Path DATA_PATH = Paths.get(DATA);

    String name;
    Integer id;
    Integer age;
}
