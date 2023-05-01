class adjoint
{
public static void main(String args[])
{
int a[][]={{1,2},{3,4}};
int i,j;
for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
int temp = a[0][0];
a[0][0]=a[1][1];
a[1][1]=temp;
a[0][1]=-a[0][1];
a[1][0]=-a[1][0];
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}





