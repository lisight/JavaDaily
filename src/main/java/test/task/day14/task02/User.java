package test.task.day14.task02;

import test.task.day14.task01.NotFoundException;

import java.util.HashMap;
import java.util.regex.Pattern;

public class User {
    static HashMap<String, String> userPassWd;
    static{
        userPassWd = new HashMap<>() ;
        userPassWd.put("123@qq.com", "password");
    }
    public void register(String username,String password)throws WrongUserNameException ,NameExistException{
        if(!checkName(username))
            throw new WrongUserNameException("用户名 " + username + " 不合法！");
        if( userPassWd.containsKey(username))
            throw new NameExistException("用户名 " + username + " 已存在！");
        userPassWd.put(username,password);
        return;
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
