package Task2;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<String> animals = new ArrayList<>();

    public Zoo() {
        animals.add("Кішка");
        animals.add("Собака");
        animals.add("Білка");
        animals.add("Кінь");
        animals.add("Черепаха");
        animals.add("Олень");
        animals.add("Порося");
        animals.add("Тушканчик");
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
