import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int r=0;
            int p=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(k % a[i]==0){
                    int m=(k/a[i]-1);
                    if(m<p){
                        p=m;
                        r=a[i];
                    }
                }
            }
            if(r==0){
                System.out.println(-1);
            }else{
                System.out.println(r);
            }
        }

    }
}
