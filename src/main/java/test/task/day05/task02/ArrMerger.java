package test.task.day05.task02;

public class ArrMerger {

    public static void main(String[] args) {
        int[] arr1 = {5,8,9,10};
        int[] arr2 = {7,9,8,9};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=arr1.length;i<arr1.length+arr2.length;i++)
            arr3[i]=arr2[i-arr1.length];
        for(int num:arr3)
            System.out.println(num);
    }
}
