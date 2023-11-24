import java.util.*;
class Prime
{
      public static void main(String args[])
      {
            Scanner as=new Scanner(System.in);
            System.out.println("Enter an integer value");
            int n=as.nextInt();
            int i=0,j=0,c=0;
            System.out.print("Prime numbers upto "+n+" are ");
            for(i=1;i<=n;i++)
            {
                  c=0;
                  for(j=1;j<=i;j++)
                  {
                        int x=i%j;
                        if(x==0)
                        {
                              c++;
                        }
                  }
                  if(c==2)
                  {
                        System.out.print(i+" ");
                  }
            }
      }
}
