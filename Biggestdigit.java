import java.util.*;
class Biggestdigit
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem=0;
int i=9;
while(n>0)
{
rem=n%10;
if(rem==9)
{
System.out.println(i);
}
else
{
n=n/10;
i=i-1;
}
}
System.out.println(i);
}
}