import java.util.*;  
public class arraylist3
{  
  public static void main(String args[])
  {  
  TreeSet <Integer>obj = new TreeSet<Integer>();  
  TreeSet <Integer>obj1 = new TreeSet<Integer>();  
  obj.add(2);     
  obj.add(8);  
  obj.add(5);  
  obj.add(1);  
  obj.add(10);  
  System.out.println(obj);  
  obj1 =(TreeSet<Integer>) obj.clone();  
  System.out.println(obj1);  
  }  
}  