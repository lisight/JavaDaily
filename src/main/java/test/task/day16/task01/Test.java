package test.task.day16.task01;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList list = new ArrayList();
        int num;
        for(int i=0;i<10;i++){
            num = random.nextInt(100)+1;
            if(num>=20){
                list.add(num);
            }
        }
        System.out.println(list);


    }
}
