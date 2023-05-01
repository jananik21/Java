import java.util.*;
class main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<Integer>(); 
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        System.out.println("Enter the number of elements in LIST 1:");
        int q=s.nextInt();
       // al1.add(q);
        for(int i=0;i<q;i++)
        {
            System.out.println("Enter Elements:");
            int ele;
            ele=s.nextInt();
            al1.add(ele);
        }
        System.out.println("Enter the number of elements in LIST 2:");
        int w=s.nextInt();
        //al2.add(w);
        for(int i=0;i<w;i++)
        {
            System.out.println("Enter Elements:");
            int eles;
            eles=s.nextInt();
            al2.add(eles);
        }
         int flag=0;
         int arr[]=new int[q];
         int j=0;
        for(int i=0;i<q;i++)
        {
            if(al1.get(i)==al2.get(i))
            {
                //flag=1;
                arr[j]=1;
                j++;
            }
            else
            {
                //flag=0;
                arr[j]=0;
                j++;
            }
        }
        int count=0;
        for(int i=0;i<q;i++)
        {
            if(arr[i]==1)
            {
                flag=1;
            }
            else
            {
                count++;
                flag=0;
            }
        }
       if(q!=w || count!=0)
        {
            System.out.println("Array List are Not Equal...");
        }
        else if(flag==1)
        {
            System.out.println("Array List are Equal...");
        }
    }
}