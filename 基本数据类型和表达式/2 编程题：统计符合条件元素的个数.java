// 统计1...n的闭区间中，能够被3整除元素的奇数和偶数的个数

// 输入格式:
// 输入值n的范围是 【1..1000】

// 输出格式:
// 奇数个数,偶数个数

// 输入样例:
// 5
// 输出样例:
// 1,0
///////////////////////////////////////////////////////////
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i%3==0) {
                b++;
            } else if(i%2!=0&&i%3==0) {
                a++;
            }
        }
        System.out.println(a + "," + b);
    }
}
