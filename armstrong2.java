class good
{
public static void main(String args[])
{
int num=121,orgnum,result=0,rem;
orgnum=num;
while(orgnum!=0)
{
rem=orgnum%10;
result+=Math.pow(rem,3);
orgnum=orgnum/10;
}
if(result==num)
{
System.out.print(num + " is an armstrong number");
}
else
{
System.out.print(num + "is not an armstrong number");
}
}
}