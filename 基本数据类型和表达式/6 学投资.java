// 小白学习了一些复利投资知识，想比较一下复利能多赚多少钱（所谓复利投资，是指每年投资的本金是上一年的本金加收益。而非复利投资是指每年投资金额不包含上一年的收益，即固定投资额）。假设他每年固定投资M元（整数），每年的年收益达到P（0<P<1，double)，那么经过N（整数）年后，复利投资比非复利投资多收入多赚多少钱呢？计算过程使用双精度浮点数，最后结果四舍五入输出整数（Math的round函数）。

// 输入格式:
// M P N

// 输出格式:
// 复利收入（含本金），非复利收入（含本金），复利比非复利收入多的部分（全部取整，四舍五入）

// 输入样例:
// 10000 0.2 3
// 输出样例:
// 17280 16000 1280
/////////////////////////////////////////////////////
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Money=sc.nextInt();
        double Profit=sc.nextDouble();
        int N_year=sc.nextInt();
        double Way_1=Money,Way_2=Money;
        for(int i=0;i<N_year;i++){
            Way_1+=Way_1*Profit;
        }
        Way_2+=Way_2*Profit*N_year;
        System.out.println(Math.round(Way_1)+" "+Math.round(Way_2)+" "+Math.round(Way_1-Way_2));
}
}
