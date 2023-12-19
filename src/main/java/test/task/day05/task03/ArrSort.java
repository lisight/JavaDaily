package test.task.day05.task03;

import java.util.Arrays;

/**
 * 第一步:将奇数放前面,偶数放后面
 * 第二步:分别对奇数部分和偶数部分进行升序排序
 * 第三步:翻转数组
 */
public class ArrSort {
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
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int a, int b) {
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }




}
