package test.task.day13.task02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    String userName;
    String passWord;
    public boolean signUp(){
        System.out.println("请输入用户名");
        Scanner scanner = new Scanner(System.in);
        String userName;
        String passWord;
        userName = scanner.nextLine();
        if(!checkName(userName)){
            System.out.println("用户名无效");
            return false;
        }
        System.out.println("请输入密码");
        passWord= scanner.nextLine();
        this.userName = userName;
        this.passWord = passWord;
        return true;
    }
    boolean checkName(String name){
        String regex = "^1[3456789]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        if(!pattern.matcher(name).matches()) {
            regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            pattern = Pattern.compile(regex);
            if (!(pattern.matcher(name).matches())) ;
            return false;
        }
        return true;
    }
}
