package test.task.day17.task02;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : list){
            if (map.containsKey(str)){
                map.replace(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        System.out.println(map);
    }
}
