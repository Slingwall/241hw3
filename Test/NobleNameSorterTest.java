import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class NobleNameSorterTest {
    private NobleNameSorter sorter;

    @Before
    public void setup() {
        sorter = new NobleNameSorter();
    }

    @Test
    public void testFullNames() {
        NobleNameSorter sorter = new NobleNameSorter();
        String n1 = "Ducissa Jane Wayne III";
        String n2 = "Principissa Jane Wayne II";
        String n3 = "Baronissa Rose Zoo V";
        sorter.add(n1);
        sorter.add(n2);
        sorter.add(n3);

        sorter.sort();
        ArrayList<String> names = sorter.getNames();
        assertEquals(n2, names.get(0));
        assertEquals(n1, names.get(1));
        assertEquals(n3, names.get(2));

        sorter.sort();
        names = sorter.getNames();
        assertEquals(n2, names.get(0));
        assertEquals(n1, names.get(1));
        assertEquals(n3, names.get(2));

        sorter.sort();
        names = sorter.getNames();
        assertEquals(n2, names.get(0));
        assertEquals(n1, names.get(1));
        assertEquals(n3, names.get(2));

        sorter.sort();
        names = sorter.getNames();
        assertEquals(n1, names.get(0));
        assertEquals(n2, names.get(1));
        assertEquals(n3, names.get(2));
    }

    @Test
    public void testTitlesNoGeneration() {
        NobleNameSorter sorter = new NobleNameSorter();
        String n1 = "Principissa Jane Wayne";
        String n2 = "Ducissa Jane Wayne" ;
        String n3 = "NobilisHomo Rose Zoo";
        sorter.add(n1);
        sorter.add(n2);
        sorter.add(n3);

        sorter.sort();
        ArrayList<String> names = sorter.getNames();
        assertEquals(n1, names.get(0));
        assertEquals(n2, names.get(1));
        assertEquals(n3, names.get(2));

        sorter.sort();
        names = sorter.getNames();
        assertEquals(n1, names.get(0));
        assertEquals(n2, names.get(1));
        assertEquals(n3, names.get(2));

        sorter.sort();
        names = sorter.getNames();
        assertEquals(n1, names.get(0));
        assertEquals(n2, names.get(1));
        assertEquals(n3, names.get(2));

        sorter.sort();
        names = sorter.getNames();
        assertEquals(n2, names.get(0));
        assertEquals(n1, names.get(1));
        assertEquals(n3, names.get(2));
    }

    @Test
    public void testSameTitle() {
        NobleNameSorter sorter = new NobleNameSorter();
        String n1 = "Ducissa Jane Wayne III";
        String n2 = "Ducissa Jane Wayne II";
        String n3 = "Eques Rose Zoo V";
        String n4 = "Ducissa Vannesay Gray";
        sorter.add(n1);
        sorter.add(n2);
        sorter.add(n3);
        sorter.add(n4);

        sorter.sort();
        sorter.sort();
        sorter.sort();
        sorter.sort();

        ArrayList<String> names = sorter.getNames();
        assertEquals(n4, names.get(0));
        assertEquals(n2, names.get(1));
        assertEquals(n1, names.get(2));
        assertEquals(n3, names.get(3));
    }


    @Test
    public void testGeneral() {
        NobleNameSorter sorter = new NobleNameSorter();
        String n1 = "Ducissa Jane Wayne III";
        String n2 = "Ducissa Jane Wayne II";
        String n3 = "Comitissa Rose Zoo V";
        String n4 = "Vanessa Gray";
        String n5 = "Caesar Rose Zoo V";
        String n6 = "Vanessa Gray V";
        String n7 = "Ducissa Vannesay Gray";
        sorter.add(n1);
        sorter.add(n2);
        sorter.add(n3);
        sorter.add(n4);
        sorter.add(n5);
        sorter.add(n6);
        sorter.add(n7);

        sorter.sort();
        sorter.sort();
        sorter.sort();
        sorter.sort();

        ArrayList<String> names = sorter.getNames();
        assertEquals(n5, names.get(0));
        assertEquals(n7, names.get(1));
        assertEquals(n2, names.get(2));
        assertEquals(n1, names.get(3));
        assertEquals(n3, names.get(4));
        assertEquals(n4, names.get(5));
        assertEquals(n6, names.get(6));
    }
}
