import java.util.Scanner;
class array
{
  public static void main(String args[])
{
    int rows,columns,i, j;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of matrix");
    rows= in.nextInt();
    columns  = in.nextInt();
    int matrix1[][] = new int[rows][columns];
    int matrix2[][] = new int[rows][columns];
    int diff[][] = new int[rows][columns];
    System.out.println("Enter the elements of matrix1");
    for (  i = 0 ; i < rows ; i++ )
{
      for ( j = 0 ; j < columns ; j++ )
{
        matrix1[i][j] = in.nextInt();
      }
    }
    System.out.println("Enter the elements of matrix2");
    for (  i = 0 ; i < rows ; i++ )
{
      for ( j = 0 ; j < columns ; j++ )
{
        matrix2[i][j] = in.nextInt();
      }
    }
    for (  i = 0 ; i < rows ; i++ )
{
      for ( j = 0 ; j < columns ; j++ )
{
        diff[i][j] = matrix1[i][j] - matrix2[i][j];  
      }
    }
     System.out.println("Difference of entered matrices:-");

    for (  i = 0 ; i < rows ; i++ )
{
      for ( j = 0 ; j < columns ; j++ )
{
        System.out.print(diff[i][j]+" ");
      } 
      System.out.println();
    }
  }
}