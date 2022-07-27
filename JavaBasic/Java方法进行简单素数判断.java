import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("素数判断");
        System.out.println("输入一个整数");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isSuShu(number)){
            System.out.println(number+"是一个素数");
        }else{
            System.out.println(number+"不是一个素数");
        }
    }
    public static boolean isSuShu(int x){
        int i;
        for(i=2;i<=x-1;i++){
            if(x%i==0){
                break;
            }
        }
        if(i>=x){
            return true;
        }else{
            return false;
        }
    }
}
