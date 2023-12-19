package test.task.day18.task03;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"123","123","12345","4321","123","213213"};
        HashSet<String> set = new HashSet<>();
        for(String str: strs){
            set.add(str);
        }
        System.out.println(set);
    }
}
