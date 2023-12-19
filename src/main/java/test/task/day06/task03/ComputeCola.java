package test.task.day06.task03;

/**
 * 3.每 3 个可乐盖可兑换 1 瓶子可乐，求买 100 瓶可乐最终可获得的可乐瓶子数。（递归练习）
 */
public class ComputeCola {
    static int cola = 100;
    static int lid = 0;
    static int tin=0;
    public static void main(String[] args) {
        exchange();
        System.out.println("最终,有"+cola+"瓶可乐");
        System.out.println("最终,有"+lid+"个盖子");
        System.out.println("最终,有"+tin+"个罐子");

    }

    private static void exchange() {
        if (cola>0){
            lid+= cola;
            tin+= cola;
            cola =0;
        }
        if (lid>2){
            cola=lid/3;
            lid=lid%3;
            exchange();
        }
        else if(lid ==2){
            lid = 0;
            tin+=1;
        }
    }


}
