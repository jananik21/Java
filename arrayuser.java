import java.util.*;
class array
{
public static void main(String args[])
{
int i,n;
Scanner inp=new Scanner(System.in);
n = inp.nextInt();
int[] array = new int[10];
for(i=0;i<n;i++)
{
array[i]=inp.nextInt();
}
for(i=0;i<n;i++)
{
System.out.print(array[i]+" ");
}
}
}
