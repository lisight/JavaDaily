package test.task.day04.task02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class judgeOdd {
    public static void main(String[] args) {
        long num ;
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个整数");
        num = scanner.nextInt();
        System.out.println(num==num>>1<<1?"偶数":"奇数");
    }

}
