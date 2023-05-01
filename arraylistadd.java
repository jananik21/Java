import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		int n=obj.nextInt();
		int a=0;
		for(int i=0;i<n;i++)
		{
		    a=obj.nextInt();
		    list1.add(a);
		}
		n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
		    a=obj.nextInt();
		    list2.add(a);
		}
		list1.addAll(list2);
		System.out.println(list1 + " ");
		
	}
}