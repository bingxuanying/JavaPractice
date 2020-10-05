package ListDemo;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        String[] items = {"aa", "bb", "cc"};

        // Fast on find item: don't need to loop through the list
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");

        // Fast on Add and Remove: don't need to resize the list
        List<String> lst = new LinkedList<String>(Arrays.asList(items));

        ListIterator<String> iterArr = arr.listIterator();
        ListIterator<String> iterLst = lst.listIterator();

    }
}
