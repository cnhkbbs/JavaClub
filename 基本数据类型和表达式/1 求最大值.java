// 本题目要求读入2个整数A和B，然后输出两个数的最大值。

// 输入格式:
// 输入在一行中给出2个绝对值不超过1000的整数A和B。

// 输出格式:
// 对每一组输入，在一行中输出最大值。

// 输入样例:
// 在这里给出一组输入。例如：

// 18 -299
// 输出样例:
// 在这里给出相应的输出。例如：

// 18
////////////////////////////////////////////////////////////////////
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            b=a;
        }else{
            a=b;
        }
        System.out.println(a);
    }
}
