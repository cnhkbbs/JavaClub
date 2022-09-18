// What is the time difference between 10:30 and 11:45?

// Your program reads two time spots and prints the time difference between them, in terms of hours and minutes.

// Input Format
// Two time spots, in 24-hour, each is represented as two numbers, as "hour minute". The second time spot is later than the first and both are within the same day.

// Output Format
// Two numbers represent the time difference. The first is the hours in the difference, while the second is the minutes.

// Sample Input
// 10 30 11 45
// Sample Output
// 1 15
///////////////////////////////////////////////////////////////////
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int h_out=0,m_out=0;
        if(m2-m1<0)
        {
            m_out=m2+60-m1;
            h2-=1;
        }else{
            m_out=m2-m1;
        }
        h_out=Math.abs(h2-h1);
        System.out.println(h_out+" "+m_out);
    }
}
