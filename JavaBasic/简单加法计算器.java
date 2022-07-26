import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("简单加法计算器");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x=sc.nextInt();
        System.out.println("请输入第二个数");
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("它们的和为"+sum);
    }
}
