import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            int OR=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                OR |=a[i];
            }
            if((OR|k)!=k){
                System.out.println(-1);
            }else{
                System.out.println(k^OR);
            }
        }

    }
}
