import java.io.*;  
import java.util.*; 
public class code7 
{   
static int Num(int n)  
{  
int[][] a = new int[n+1][n+1];  
a[0][0] = 1;  
for (int i=1; i<=n; i++)  
{  
a[i][0] = a[i-1][i-1];  
for (int j=1; j<=i; j++)  
a[i][j] = a[i-1][j-1] + a[i][j-1];  
}  
return a[n][0];  
}   
public static void main (String args[])  
{  
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    System.out.println("Ans:"+Num(n));  
}  
}