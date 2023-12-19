package test.task.day17.task03;


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
        //
        ArrayList<String> orderedList = new ArrayList();
        String targetKey=null;
        int biggest = 0;
        while(orderedList.size()!=map.size()){
            for(String key: map.keySet()){
                if(!orderedList.contains(key)){
                    if(map.get(key)>biggest){
                        biggest=map.get(key);
                        targetKey=key;
                    }
                }
            }
            biggest = 0;
            orderedList.add(targetKey);
        }
        for(String key :orderedList){
            System.out.println("key="+key+",value="+map.get(key));
        }


    }
}
