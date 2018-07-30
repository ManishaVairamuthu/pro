import java.util.*;
class nonrepeatcount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0,res=0;
        for(int i=0;i<s.length();i++)
        {
            count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && i!=j)
                count++;
            }
            if(count==0)
            res=res+1;
        }
        System.out.print(res);
    }
}
