package Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);
        }

        System.out.println("Початковий лист: " + integerArrayList);

        ListIterator<Integer> iterator = integerArrayList.listIterator();
        int index = 0;
        while (iterator.hasNext()) {
            int element = iterator.next();
            integerArrayList.set(index, ++element);
            index++;
        }

        System.out.println("Збільшений на 1 лист: " + integerArrayList);


    }
}
