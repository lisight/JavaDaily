package test.task.day17.task01;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.遍历集合，并将序号与对应人名打印。
 * 	2.向该map集合中插入一个编码为5叫wang人
 * 	3.移除该map中的编号为1的信息
 * 	4.将map集合中编号为2的姓名信息修改为sy
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "sy");
        map.put(2, "ls");
        map.put(3, "zl");
        map.put(4, "sl");
        for(int key: map.keySet()){
            System.out.println("Key="+key+",value="+map.get(key));
        }
        map.put(5,"wang");
        map.remove(1);
        map.replace(2,"sy");
        for(int key: map.keySet()){
            System.out.println("Key="+key+",value="+map.get(key));
        }
    }
}
