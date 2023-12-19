package test.task.day05.task01;

import java.lang.reflect.Array;

public class TestForForeach {
    public static void main(String[] args) {
        int[] ages ={12,15,20};
        for(int i=0;i<ages.length;i++)
            System.out.println(ages[i]);
        for(int age:ages)
            System.out.println(age);
    }

}
