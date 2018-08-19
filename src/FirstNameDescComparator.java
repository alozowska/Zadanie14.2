import java.util.Comparator;

public class FirstNameDescComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getFirstName().compareTo(o2.getFirstName()) < 0)
            return 1;
        else if (o1.getFirstName().compareTo(o2.getFirstName()) > 0)
            return -1;
        else
            return 0;

    }
}
