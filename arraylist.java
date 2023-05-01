import java.util.Scanner;
class arraylist{
  public static void main (String args[]){
  Scanner sc=new Scanner(System.in);
  int choice;
  choice = sc.nextInt();
  ArrayList<String> al=new ArrayList<String>();
  al.add("Chocolate");
  al.add("Vannila");
  al.add("Butterscotch");
  ArrayList<String> al2=new ArrayList<String>();
  al2.add("diary_milk");
  al2.add("kitkat");
  al2.add("fivestar");
  Iterator itr=al.iterator();
  switch(choice){
  case 1:
  al.addAll(al2); 
  while(itr.hasNext()){
   System.out.println(itr.next());}
   break;
  case 2:
  al.removeAll(al2);
  System.out.println("iterating the elements after removing the elements of al2...");
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
  break;

  case 3:
  al.retainAll(al2);
  System.out.println("iterating the elements after retaining the elements of al2...");
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
  break;
}
}
}
