

import java.io.IOException;
import java.util.Scanner;

public class Source {
    public static void main(String[] args)
            throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(sc.next());
        int b=Integer.parseInt(sc.next());
        int c=Integer.parseInt(sc.next());
        int d=Integer.parseInt(sc.next());


        int s1=Math.abs(a-b);
        int s2=Math.abs(c-d);

        int s=s1+s2;
        System.out.println(s);

    }
}
