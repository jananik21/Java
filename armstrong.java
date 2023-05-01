class armstrong
{
public static void main(String args[])
{
int num = 371;
int orgnumber,result=0,rem;
orgnumber=num;
while(orgnumber!=0)
{
rem=orgnumber%10;
result+=Math.pow(rem,3);
orgnumber = orgnumber/10;
}
if(result==num)
{
System.out.println(num + " is an armstrong number");
}
else
{
System.out.println(num + " is not an armstrong number");
}
}
}


