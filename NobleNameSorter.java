import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


/**
 * Implements a noble name sorter using radix sort
 */
public class NobleNameSorter {
    public NobleNameSorter() {
    }

    public void add(String name) {
    }

    public ArrayList<String> getNames() {
        return null;
    }

    public void sort() {
    }

    public static void main(String[] args) {
        NobleNameSorter sorter = new NobleNameSorter();
        sorter.add("Ducissa Jane Wayne III");
        sorter.add("Jayne Wayne II");
        sorter.add("Jane Wayne");
        sorter.add("Ducissa Jane Wayne");
        sorter.add("Baronissa Rose Zoo");

        sorter.sort();
        System.out.println("Pass 1: " + sorter.getNames());
        sorter.sort();
        System.out.println("Pass 2: " + sorter.getNames());
        sorter.sort();
        System.out.println("Pass 3: " + sorter.getNames());
        sorter.sort();
        System.out.println("Pass 4: " + sorter.getNames());
    }
}
