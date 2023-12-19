package test.task.day04.task07;

import java.util.Scanner;

public class ComputeFactorial {
    public static void main(String[] args) {
        int num;
        double factorial= 1;
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个整数");
        num= scanner.nextInt();
        for(int i=num;i>1;i--)
            factorial *= i;
        System.out.println(factorial);
    }

}
