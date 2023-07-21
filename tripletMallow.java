import java.util.Scanner;
public class tripletMallow {
    public static int find3Numbers(int t,int arr[])
    {
int count =0;
int n= arr.length;
for(int i =0;i<n-2;i++)
{
    for(int j = i+1;j<n-1;j++)
    {
        for(int k = j+1;k<n;k++)
        {
            if(arr[i]<arr[j] && arr[j]<arr[k] && ((arr[i]+arr[j]+arr[k])<=t))
            {
                count++;
            }
        }
    }
}
return count;
    }
public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = find3Numbers(t,arr);
        System.out.print(" "+result); 
    }
}
