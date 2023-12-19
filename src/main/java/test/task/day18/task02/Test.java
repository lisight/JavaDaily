package test.task.day18.task02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
        HashSet<String> set = new HashSet<>();
        for(String str:list){
            set.add(str);
        }
        System.out.println(set);

        HashMap<String,Integer> map = new HashMap<>();
        for(String str:list){
            if (!map.keySet().contains(str)){
                map.put(str,1);
            }else{
                map.replace(str,map.get(str)+1);
            }
        }
        System.out.println(map);

    }
}
