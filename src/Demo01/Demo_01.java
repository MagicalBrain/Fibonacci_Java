package Demo01;
import java.util.Scanner;

public class Demo_01 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);//创建键盘录入类Scanner 的对象
        int num01  = sc.nextInt();
        int num02  = sc.nextInt();
        int re;
        //re = fib(num);
        re = fib_k(num01,num02);
            System.out.println(re);



        //System.out.println("hello,java!\n"+shuru());

    }

    //二阶斐波那契数列
    public static int fib(int a)
    {
        if ( a== 0)
            return 0;
        else if (a == 1)
            return 1;
        else
            return fib(a-1) + fib(a-2);
    }

    //k阶斐波那数列
    public static int fib_k(int a,int k)
    {
        int re = 0;
        if (a < k-1)
            return 0;
        else if (a == k-1)
            return 1;
        else
        {
            for (int i=1;i<=k;i++)
                re+=fib_k(a-i,k);
            return re;
        }
    }
}
