import java.util.Comparator;

public class LastNameDescComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getLastName().compareTo(o2.getLastName()) < 0)
            return 1;
        else if (o1.getLastName().compareTo(o2.getLastName()) > 0)
            return -1;
        else
            return 0;

    }
}
