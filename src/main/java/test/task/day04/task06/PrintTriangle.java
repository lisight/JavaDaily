package test.task.day04.task06;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        int row;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入行数");
        row = scanner.nextInt();
        for(int i=0;i<row;i++){
            for(int j=row-i-1;j>0;j--)
                System.out.print(" ");
            for (int k=2*i+1;k>0;k--)
                System.out.print("*");
            System.out.println("");
        }
    }

}
