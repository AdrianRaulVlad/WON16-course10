package homework;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> employees = new ArrayList<>();

    private Person manager;

    public void employ(Person p) {
        employees.add(p);
    }
}
