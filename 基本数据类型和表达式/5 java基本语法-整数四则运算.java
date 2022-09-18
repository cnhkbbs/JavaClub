// 输入2个整数，输出它们的和、差、乘积和准确的商。

// 输入格式:
// 输入两个整数

// 输出格式:
// 每一行中依次输出四则运算的结果

// 输入样例:
// 70
// 16 
// 输出样例:
// 在这里给出相应的输出。例如：

// 86
// 54
// 1120
// 4.375
///////////////////////////////////////////////////////
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double z=(double)x/(double)y;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(z);
    }
}
