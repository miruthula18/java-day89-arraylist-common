import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list2.add(20);
        list2.add(40);
        list2.add(50);
        list1.retainAll(list2);
        System.out.println("Common Elements: " + list1);
    }
}