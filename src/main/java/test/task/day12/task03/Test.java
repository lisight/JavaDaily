package test.task.day12.task03;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int num;
        int total=0;
        Random random = new Random();
        for(int i =0; i<10;i++) {
            num = random.nextInt(31) + 20;
            if (num != (num >> 1 << 1))
                total += num;
        }
        System.out.println("总数:"+total);
    }
}
