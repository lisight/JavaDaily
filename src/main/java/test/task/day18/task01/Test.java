package test.task.day18.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<User> list = new ArrayList();
        int loginCount;
        for(int i =0; i<10; i++) {
            loginCount = random.nextInt(100);
            list.add(new User(Integer.toString(loginCount + 100 * i), loginCount));
        }
        Collections.sort(list, Collections.reverseOrder());
        for(User user :list){
            System.out.println("次数:"+user.loginCount+",名字:"+user.username);
        }




    }
}
