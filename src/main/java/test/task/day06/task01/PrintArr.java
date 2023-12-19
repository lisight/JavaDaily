package test.task.day06.task01;

import java.util.Arrays;

/**
 * 使用day05task03的代码
 * 只关注数组打印部分的手写(从第44行开始)
 */
public class PrintArr  {
        static int[] arr ={30,28,19,17,33,25,6,77,10,9};
        public static void main(String[] args) {
            int startPtr=0;
            int endPtr=arr.length-1;
            int oddNum =0;
            //将奇数方前面,偶数放后面
            while(startPtr != endPtr){
                if (arr[startPtr]!=arr[startPtr]>>1<<1) {
                    startPtr++;
                }
                if (arr[endPtr]==arr[endPtr]>>1<<1) {
                    endPtr--;
                }
                swap(startPtr,endPtr);
            }
            //计算奇数的个数
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr[i]>>1<<1){
                    oddNum++;
                }
                else{
                    break;
                }
            }
            //对奇数部分和偶数部分分别排序

            Arrays.sort(arr,0,oddNum);
            Arrays.sort(arr,oddNum,arr.length);
            System.out.println(Arrays.toString(arr));

            //翻转整个数组
            for(int i=0;i<arr.length/2;i++){
                swap(i,arr.length-1-i);
            }
            print(arr);
        }

    private static void print(int[] arr) {
        System.out.print("[");
        for(int i= 0; i < arr.length-1; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[arr.length-1]);
        System.out.println("]");
    }

    private static void swap(int a, int b) {
            int temp;
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }

 }
