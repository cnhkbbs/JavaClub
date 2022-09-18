// 根据输入的正整数y所代表的年份，计算输出该年份是否为闰年
// 闰年的判断标准：

// 能够被4整除且不能被100整除的年份

// 或者能够被400整除的年份

// 输入格式:
// 输入n取值范围是 【1..3000】

// 输出格式:
// 是闰年，输出 yes

// 非闰年，输出 no

// 输入样例:
// 在这里给出一组输入。例如：

// 100
// 输出样例:
// 在这里给出相应的输出。例如：

// no
////////////////////////////////////////////////////
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
