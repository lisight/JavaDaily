package test.task.day14.task01;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        try {
            searchInArray(array, target);
        } catch (NotFoundException e) {
            System.out.println("异常处理：" + e.getMessage());
        }
    }

    public static void searchInArray(int[] array, int target) throws NotFoundException {
        for (int num : array) {
            if (num == target) {
                System.out.println("目标数 " + target + " 在数组中找到了！");
                return;
            }
        }

        throw new NotFoundException("目标数 " + target + " 在数组中未找到！");
    }
}
