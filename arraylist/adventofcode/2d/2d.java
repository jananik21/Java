import java.util.*;  
class UserInputDemo1  
{  
public static void main(String[] args)  
{  
 //System.in is a standard input stream  
//System.out.println("\t"+"H"+"\t"+"E"+"\t"+"E"+"\t"+"L"+"\t"+"o"); 
Scanner sc= new Scanner(System.in);
int[][] arr; //System.in is a standard input stream  
int r=sc.nextInt(); 
int c=sc.nextInt(); 
arr= new int[r][c];

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
    
 arr[i][j]=sc.nextInt(); 
}
}

}
}