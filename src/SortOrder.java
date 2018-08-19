import java.util.Comparator;

public enum SortOrder {
    IMIE_ROSNACO(new FirstNameAscComparator()),
    IMIE_MALEJACO(new FirstNameDescComparator()),
    NAZWISKO_ROSNACO(new LastNameAscComparator()),
    NAZWISKO_MALEJACO(new LastNameDescComparator());

    private final Comparator<Person> comparator;


    SortOrder(Comparator<Person> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Person> getComparator() {
        return comparator;
    }

}
