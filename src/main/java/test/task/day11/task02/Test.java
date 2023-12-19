package test.task.day11.task02;

import java.util.ArrayList;

/**
 * 2、字符串练习
 * 字符串中使用了某种特定分隔符-分割的所有字符串重新获取并以字符串数组返回;
 * 对给定的字符串从此字符串中查找是否包含特定的字符串;
 * 对用户个人电子邮箱格式进行验证,验证规则为必需而且只能有一个@符号,必需以.163为后缀，不能有_  特殊字符。
 */

public class Test {
    public static void main(String[] args) {
        String str = "131-5798-5558";
        String str1 = "131";
        String[] strs = str.split("-");
        for(String str0:strs){
            System.out.println(str0);
        }
        System.out.println(str.contains(str1));

        String email = "515641430@163.com";

        boolean test = test(email);
        System.out.println(test?"验证成功":"验证失败");


    }
    public static boolean test(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='_')
                return false;
            if (str.charAt(i) ==' ')
                return false;
            if (str.charAt(i) == '@') {
                count++;
                if (count >1)
                    return false;
            }
        }
        if (count ==0)
            return false;
        String substring = str.substring(str.length()-7,str.length());
        System.out.println(substring);
        if(!substring.equals("163.com"))
            return false;
        return true;
    }




}
