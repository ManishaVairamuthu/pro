import java.util.*;
class avg
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int av1=0,av2=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        if(n>2)
      {
        int n1[]=new int[n/2+1];
        int n2[]=new int[n-(n/2+1)];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(i<=n/2)
            n1[i]=ar[i];
            else
            {
            n2[j]=ar[i];
            j++;
            }
        }
        int ad1=0;
        int ad2=0;
        for(int i=0;i<n1.length;i++)
        {
            ad1=ad1+n1[i];
        }
        for(int i=0;i<n2.length;i++)
        {
            ad2=ad2+n2[i];
        }
         av1=ad1/(n1.length);
         av2=ad2/(n2.length);
      }
      else if(n==2)
      {
          av1=ar[0];
          av2=ar[1];
      }
        if(av1==av2)
        System.out.print("yes");
        else
        System.out.print("no");
     }
}
