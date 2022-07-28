import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("*****猜数字*****");
        System.out.println("输入随机数最大范围");
        int maxNumber = sc.nextInt();
        int randomNumber = ra.nextInt(maxNumber);
        int times = 0;
        for (; times < 10; times++) {
            System.out.println("输入你的猜测");
            int flag = Compare(randomNumber);
            if (flag == 1) {
                System.out.println("******************");
                System.out.println("猜测正确");
                break;
            } else if (flag == 2) {
                System.out.println("******************");
                System.out.println("太大了,你还有" + (9 - times) + "次机会");
            } else if (flag == 3) {
                System.out.println("******************");
                System.out.println("太小了,你还有" + (9 - times) + "次机会");
            }
        }
    }

    public static int Compare(int target) {
        Scanner sc = new Scanner(System.in);
        int UserIn = sc.nextInt();
        if (UserIn == target) {
            return 1;
        } else if (UserIn > target) {
            return 2;
        } else {
            return 3;
        }
    }
}
