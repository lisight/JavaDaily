package test.task.day14.task02;

import test.task.day14.task01.NotFoundException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        String username = null;
        String password;
        while(username != "123") {
            System.out.println("请输入用户名");
            Scanner scanner = new Scanner(System.in);
            username = scanner.nextLine();
            System.out.println("请输入密码");
            password = scanner.nextLine();
            try {
                user.register(username, password);
            } catch (Exception e) {
                System.out.println("异常处理：" + e.getMessage());
            }

        }
    }
}
