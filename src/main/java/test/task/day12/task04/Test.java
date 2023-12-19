package test.task.day12.task04;

import java.util.Random;

/**
 * 4、生成 18 - 60 年龄数据20个，存放到年龄数组 int[] 中，并排序打印
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ages = new int[20];
        for(int i=0;i<20;i++){
            ages[i]=random.nextInt(43)+18;
        }
        System.out.print("[");
        for(int i=0;i<19;i++){
            System.out.print(ages[i]+",");
        }
        System.out.println(ages[19]+"]");
    }
}
