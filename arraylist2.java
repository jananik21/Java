import java.util.TreeSet;
class arraylist2{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(221);
        numbers.add(555);
        numbers.add(666);
        System.out.println("numbers");
        boolean value1 = numbers.remove(555);
        System.out.println("Is 555 removed? " + value1);
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}
