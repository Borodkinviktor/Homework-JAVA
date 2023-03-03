import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", "Белый", "HP"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", "Черный", "Asus"));
        set.add(new Notebook("Notebook 3", 32, "linux", "Серый", "Lenovo"));
        set.add(new Notebook("Notebook 4", 64, "linux", "Золотой", "Lenovo"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}