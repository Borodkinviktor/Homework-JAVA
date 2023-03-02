import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        // что 1 человек может иметь несколько телефонов.

public class Task01 {
    public static void main(String[] args) {
        
        Phonebook phonebook = new Phonebook();
        phonebook.showPhonebook();
        System.out.println("=================================");
        phonebook.add("Иванов", 3456782);
        phonebook.add("Иванов", 4568978);
        phonebook.add("Петров", 3452222);
        phonebook.add("Сидаров", 1328978);
        phonebook.showPhoneNumber("Иванов");
        System.out.println("=================================");
        phonebook.showPhoneNumber("Сидаров");
        System.out.println("=================================");
        phonebook.showPhoneNumber("Агапитова");
        System.out.println("=================================");
        phonebook.showPhonebook();

    }
}