import java.util.*;
class anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            res=res+s.charAt(i);
        }
        if(res.equals("dhoni"))
        System.out.print("yes");
        else
                System.out.print("no");
    }
}
