import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0,b=1,c;
        c = a+b;
        System.out.println(a+" ");
        System.out.println(b+" ");
        while(c <= n){
            System.out.print(c+" ");
            a = b;
            b = c;
            c= a + b;
        }
    }
}