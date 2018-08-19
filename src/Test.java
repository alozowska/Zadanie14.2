import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Anna", "Kowalska"));
        people.add(new Person("Basia", "Zawadzka"));

        wyswietlMenu(SortOrder.values());


        String userInput = scanner.nextLine();
        while (!sprawdzenie(userInput, SortOrder.values())) {
            System.out.println("Podana wartość jest nieprawidłowa, wybierz ponownie ");
            wyswietlMenu(SortOrder.values());
            userInput = scanner.nextLine();
        }
        SortOrder sortOrder = Enum.valueOf(SortOrder.class, userInput);
        Collections.sort(people, sortOrder.getComparator());
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }

    public static void wyswietlMenu(SortOrder[] values) {
        System.out.println("Menu: ");
        for (SortOrder menu : values) {
            System.out.println(menu);
        }
    }

    public static boolean sprawdzenie(String userInput, SortOrder[] values) {
        int i = 0;
        while (i < values.length && !userInput.equalsIgnoreCase(values[i].toString())) {
            i++;
        }
        if (i < values.length) {
            return true;
        } else {
            return false;
        }

        // return  i < values[i];
    }
}
