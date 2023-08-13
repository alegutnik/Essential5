package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Віктор");
        friends.add("Семен");
        friends.add("Марія");
        friends.add("Ганна");

        System.out.println("Початковий список: " + friends);
        Collections.sort(friends);
        System.out.println("Сортирований список: " + friends);
    }

}
