package test.task.day04.task03;

import java.util.Scanner;

public class compareNum {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入第一个整数");
        num1 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        num2 = scanner.nextInt();
        if(num1>num2){
            System.out.println(">");
        }
        else if (num1==num2) {
            System.out.println("=");
        }
        else{
            System.out.println("<");
        }

    }


}
