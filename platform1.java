import java.util.Scanner;
public class Platform {
  public static void findPLatform(int arr[],int dep[],int n)
  {
    int plat_needed = 1;
    int result = 1;
    for(int i=0;i<n;i++)
    {
        plat_needed=1;
    for(int j=0;j<n;j++)
    {
        if(i!=j)
        {
        if(arr[i]>=arr[j] && dep[j]>=arr[i])
        {
            plat_needed++;
        }
        result = Math.max(result,plat_needed);
    }
    return result;
 }  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    arr[] = new arr[n];
    dep[]= new dep[n];
    for(inti=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        dep[i]=sc.nextInt();
    }
    System.out.println( findPlatform(arr,dep,n))
  }
}
