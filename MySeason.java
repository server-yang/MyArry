import java.util.Scanner;

public class MySeason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入月份：");
        int sc = s.nextInt();
        switch (isSeason(sc)){
            case Autumn:
                System.out.println("秋天");
                break;
            case Spring:
                System.out.println("春天");
                break;
            case Summer:
                System.out.println("夏天");
                break;
            case Winter:
                System.out.println("冬天");
                break;
            default:
                System.err.println("输入错误");
        }
    }

    public static Season isSeason(int mon){
        if (mon<=3){
            return Season.Spring;
        }else if (mon<=6){
            return Season.Summer;
        }else if (mon<=9){
            return Season.Autumn;
        }else if (mon<=12){
            return Season.Winter;
        }
        return Season.Err;
    }

}
enum Season{
    Spring,Summer,Autumn,Winter,Err
}
